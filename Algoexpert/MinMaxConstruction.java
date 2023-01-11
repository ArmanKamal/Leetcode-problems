import java.util.*;

class MinMaxConstruction {

  public static void main(String[] args) {
    System.out.println("Implementation of a stack using Stack util");
    MinMaxConstruction minMaxConstruction = new MinMaxConstruction();
    System.out.println("Peek1: " + minMaxConstruction.peek());

    minMaxConstruction.push(10);
    minMaxConstruction.push(15);
    minMaxConstruction.push(25);
    minMaxConstruction.pop();

    System.out.println("Peek 2: " + minMaxConstruction.peek());

    System.out.println("Minimum: " + minMaxConstruction.getMin());
    System.out.println("Maximum: " + minMaxConstruction.getMax());

  }


  
  Stack<Integer> stack = new Stack();
  Stack<Integer> min_vals = new Stack();
  Stack<Integer> max_vals = new Stack();

  public int peek() {
    // Write your code here.
    if (stack.isEmpty()) {
      return 0;
    }
    return stack.peek();
  }

  public int pop() {
    if (stack.peek().equals(min_vals.peek())) {
      min_vals.pop();
    }
    if (stack.peek().equals(max_vals.peek())) {
      max_vals.pop();
    }
    return stack.pop();
  }

  public void push(Integer number) {
    if (min_vals.isEmpty() || number <= min_vals.peek()) {
      min_vals.push(number);
    }
    if (max_vals.isEmpty() || number >= max_vals.peek()) {
      max_vals.push(number);
    }

    stack.push(number);
  }

  public int getMin() {
    // Write your code here.
    return min_vals.peek();
  }

  public int getMax() {
    // Write your code here.
    return max_vals.peek();
  }
}