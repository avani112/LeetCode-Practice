/*
You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.
*/
class Solution {
    public int[] charFreq = new int[26];//to store frequency of every character in countCharacters method
    boolean isgood(String s){
         int[] freq = new int[26];//to store frequency of every character for every element (word)
        for(char c : s.toCharArray()) ++freq[c - 'a'];
        for(int i = 0; i < 26; i++) if(freq[i] > charFreq[i]) return false;
		
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for(char c : chars.toCharArray()) ++charFreq[c - 'a'];
        for(String word : words) if(isgood(word)) count += word.length();
		
        return count;
    }
}