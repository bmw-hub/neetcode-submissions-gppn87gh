class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int no=target-nums[i];
        if(seen.containsKey(no)){
            return new int[]{seen.get(no), i};
            }
        
        seen.put(nums[i],i);
    }
    return null;
    }
}


