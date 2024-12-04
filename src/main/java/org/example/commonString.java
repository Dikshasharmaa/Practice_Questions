package org.example;

public class commonString {

    // Find the longest common substring between two strings.
    public String longestSubstring(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1]; // DP table to store lengths of common substrings
        int maxLength = 0; // Maximum length of common substring
        int endIndex = 0; // Ending index of the longest common substring in str1

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;
                    }
                }
            }
        }

        return str1.substring(endIndex - maxLength + 1, endIndex + 1);
    }



}



  