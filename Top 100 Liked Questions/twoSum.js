/* Time complexity o(n) */
/* Space complexity o(n) */

function twoNumberSum(nums, target){
    const taken = {}

    for(let i=0;i<nums.length;i++){
        let x  = target-nums[i]
        if(x in taken){
            return [taken[x],i]
        }
        taken[nums[i]] = i
    }
}

const nums = [2,7,11,15]
let target = 9

console.log(twoNumberSum(nums,target))



/* Solution 2 Time wise O(n)logn
 Space O(1)


    // nums.sort(sort)
    // let left = nums[0]
    // let right = nums[nums.length - 1]

    // while(left<right){
    //     if(nums[left]+nums[right] > target){
    //         right--;
    //     }
    //     if(nums[left]+nums[right] < target){
    //         left --;
    //     }
    //     if(nums[left]+nums[right] == target){
    //         return [left,right]
    //     }
    // }


};

// const sort = (a,b) =>{
//     return a-b
// }