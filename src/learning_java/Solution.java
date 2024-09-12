/*
package learning_java;

class Solution {
    // longest prefix
    */
/*public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);*//*

    // Longest Substring Without Repeating Characters
    */
/*public static int lengthOfLongestSubstring(String s) {
        List<Character> substringL = new ArrayList<>();
        int LargestLength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (substringL.contains(s.charAt(right))) {
                // get the index of the char
                int index = substringL.indexOf(s.charAt(right));
                substringL.remove(index);
                if (index > 0)
                    substringL.subList(0, index).clear();
            }
            substringL.add(s.charAt(right));
            LargestLength = Math.max(LargestLength, substringL.size());
        }
        return LargestLength;
    }*//*

    // Median of Two Sorted Arrays
    */
/*public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newarray = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, newarray, 0, nums1.length);
        System.arraycopy(nums2, 0, newarray, nums1.length, nums2.length);
        Arrays.sort(newarray);
        int lf = nums1.length+nums2.length;
        if(lf%2==0){
            double f1 = newarray[lf / 2];
            double f2 = newarray[(lf/2)-1];
            return (f1+f2)/2 ;
        }else{
            return newarray[lf/2];
        }
    }*//*

    // 5. Longest Palindromic Substring
    public static String longestPalindrome(String s) {
        return s;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
*/
