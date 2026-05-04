class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count frequencies
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // 2. Put unique numbers into a list and sort by their frequency
        List<Integer> list = new ArrayList<>(count.keySet());
        list.sort((a, b) -> count.get(b) - count.get(a));

        // 3. Take the first k elements
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}