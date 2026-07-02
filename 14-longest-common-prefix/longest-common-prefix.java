class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";
        if(strs.length > 1){
            for(int i =0; i < strs[0].length(); i++){
                Boolean charactersAreEqual = false;
                for(int j = 1; j < strs.length; j++){
                    if(i < strs[j].length()){
                        if(strs[0].charAt(i) == strs[j].charAt(i)){
                            charactersAreEqual = true;
                        }
                        else{
                            charactersAreEqual = false;
                            break;
                        }
                    }
                    else{
                        charactersAreEqual = false;
                        break;
                    }
                }
                if(charactersAreEqual){
                    longestCommonPrefix += strs[0].charAt(i);
                }
                else{
                    break;
                }
            }
        }
        else{
            longestCommonPrefix += strs[0];
        }
        return longestCommonPrefix;
    }
}