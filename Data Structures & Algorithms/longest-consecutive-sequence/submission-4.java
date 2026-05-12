class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int len=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int start=num;
                while(set.contains(start)){
                start++;
            }
            len=Math.max(len,start-num);
        }
    }
    return len;
}
}


