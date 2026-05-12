class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-indexed
            } else if (sum > target) {
                right--;  // sum too big → shrink from right
            } else {
                left++;   // sum too small → grow from left
            }
        }
        return new int[]{};  // never reached (guaranteed solution)
    }
}