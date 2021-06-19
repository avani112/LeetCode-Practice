/*
You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change any '0' to '1' or vice versa.

The string is called alternating if no two adjacent characters are equal. For example, the string "010" is alternating, while the string "0100" is not.

Return the minimum number of operations needed to make s alternating.
*/

class Solution {
    public int minOperations(String st) {
    int min_swaps = 0;
    int odd_0 = 0, even_0 = 0;
    int odd_1 = 0, even_1 = 0;
    int n = st.length();
    for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { 
                if (st.charAt(i) == '1') 
                    even_1++;
                else 
                    even_0++;
            }
            else { 
                if (st.charAt(i) == '1') 
                    odd_1++;
                else 
                    odd_0++;
            }
        }
  
        // alternating string starts with 0
        int cnt_swaps_1 = Math.min(even_0, odd_1); 
  
        // alternating string starts with 1
        int cnt_swaps_2 = Math.min(even_1, odd_0); 
  
        // calculates the minimum number of swaps
        return Math.min(cnt_swaps_1, cnt_swaps_2);
    }
}
