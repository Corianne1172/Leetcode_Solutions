class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mergedString = "";
        if(word1.length() < word2.length()){
            for(int i =0; i<word1.length(); i++){
                mergedString += word1.charAt(i);
                mergedString += word2.charAt(i);
            }
            mergedString += word2.substring(word1.length());
        }
        else{
            for(int i =0; i<word2.length(); i++){
                mergedString += word1.charAt(i);
                mergedString += word2.charAt(i);
            }
            mergedString += word1.substring(word2.length());
        }
        return mergedString;
    }
}