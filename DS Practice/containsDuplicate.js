var containsDuplicate = function(nums) {
    const checkHashMap = {}
    
    for(let i=0;i<nums.length;i++){
        if(!(nums[i] in checkHashMap)){
        
            checkHashMap[nums[i]] = true
        }
        else{
            return true
        }
       
    }
    return false
};

/* Also we can do sort the array and then compare but it's O(n)logn
/* Another approach will be nested for loop and comparing but that's ever worse time complexity
