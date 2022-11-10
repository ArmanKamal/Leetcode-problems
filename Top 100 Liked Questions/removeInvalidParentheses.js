function removeInvalidParentheses(s){
    const pairs = {
        "(": ")",
        "{": "}",
        "[":"]"
    }

    const stack = []

    for(let i=0;i<s.length;i++){
        if(s[i] in pairs){
            stack.push(s[i])
        }
        else{
            if(stack.length < 1){
                return false
            }
            if(pairs[stack.pop()] != s[i]){
                return false
            }
        }
    }
    return stack.length < 1
}
// console.log(removeInvalidParentheses("()"))
console.log(removeInvalidParentheses("((){)"))

