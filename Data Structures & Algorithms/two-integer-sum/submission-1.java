class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int no=target-nums[i];
        if(seen.containsKey(no)){
            int index1=seen.get(no);
            int index2=i;
            int res[]={index1,index2};
            return res;
            }
        
        seen.put(nums[i],i);
    }
    return new int[]{};
    }
}


