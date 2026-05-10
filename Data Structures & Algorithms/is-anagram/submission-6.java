class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
// Create an array to track counts of the 26 lowercase letters
        int[] count = new int[26];
       // Increment for string s, decrement for string t
       for(int i=0;i<s.length();i++){
        count[s.charAt(i)-'a']++;
        count[t.charAt(i)-'a']--;
       }
// If it's a valid anagram, every index in count should be 0
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}

