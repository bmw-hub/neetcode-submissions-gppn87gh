class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Max Heap based on frequency
        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));

        // Add all keys into heap
        maxHeap.addAll(freqMap.keySet());

        // Step 3: Get top k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}