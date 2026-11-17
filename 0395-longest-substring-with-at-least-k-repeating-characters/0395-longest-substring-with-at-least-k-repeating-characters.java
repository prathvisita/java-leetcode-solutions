// class Solution {
   
//     public int longestSubstring(String s, int k) {
//        HashMap<Character,Integer>freq=new HashMap<>();
//        for(int i=0;i<s.length();i++){
//         freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
//        }
       
      
      class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s, 0, s.length(), k);
    }

    private int helper(String s, int start, int end, int k) {
        // Base Case 1: Substring is shorter than k, so it cannot be valid
        if (end - start < k) {
            return 0;
        }

        // Step 1: Count character frequencies in the current range [start, end)
        int[] freq = new int[26];
        for (int i = start; i < end; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: Find the first invalid character (frequency < k) to split on
        for (int mid = start; mid < end; mid++) {
            if (freq[s.charAt(mid) - 'a'] < k) {
                // Skip consecutive invalid characters to avoid unnecessary empty calls
                int nextStart = mid + 1;
                while (nextStart < end && freq[s.charAt(nextStart) - 'a'] < k) {
                    nextStart++;
                }

                // Step 3: Divide & Conquer on left and right sides
                int leftMax = helper(s, start, mid, k);
                int rightMax = helper(s, nextStart, end, k);

                // Step 4: Combine results
                return Math.max(leftMax, rightMax);
            }
        }

        // Base Case 2: Every character in [start, end) appears at least k times
        return end - start;
    }
}

    

