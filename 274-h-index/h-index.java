class Solution {
    public int hIndex(int[] citations) {
       int[] paperCount = new int[citations.length];
       int hIndex = 0;

       for(int i = 0; i < citations.length; i++){
            for(int j = 0; j < citations.length; j++){
                if(citations[j] >= citations[i]){
                    paperCount[i]++;
                }
            }
            hIndex = Math.max(hIndex, Math.min(paperCount[i], citations[i]));

        }
        return hIndex;
    }
}