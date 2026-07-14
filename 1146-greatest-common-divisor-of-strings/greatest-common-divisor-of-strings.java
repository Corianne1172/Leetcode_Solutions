class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int smallerString = Math.min(str1.length(), str2.length());
        for(int i=smallerString; i>0; i--){
            String candidate = str1.substring(0, i);
            if(str1.length() % candidate.length() == 0 && str2.length() % candidate.length() == 0){
                int gcdInStr1 = str1.length() / candidate.length();
                int gcdInStr2 = str2.length() / candidate.length();
                if(candidate.repeat(gcdInStr1).equals(str1) && candidate.repeat(gcdInStr2).equals(str2)){
                    return candidate;
                }
            }
        }
        return "";
    }
}