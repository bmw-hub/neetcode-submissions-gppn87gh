class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int no=target-nums[i];
            if(hm.containsKey(no)){
                int index1=hm.get(no);
                int index2=i;
                int res[]={index1,index2};
                return res;
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}
