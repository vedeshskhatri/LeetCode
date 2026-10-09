class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[] = new int [26];
        int n = s.length();
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            maxi = Math.max(maxi, freq[ch - 'a']);

        }
        
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0 && freq[i] != maxi) {
                return false;
            }
        }

        return true;
    }
}