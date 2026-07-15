class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int planted = 0;
        int leftPlot, currentPlot, rightPlot;
        for(int i = 0; i < flowerbed.length; i++){
            leftPlot = (i == 0) ? 0 : flowerbed[i-1];
            currentPlot = flowerbed[i];
            rightPlot = (i == flowerbed.length-1) ? 0 : flowerbed[i+1];

            if(leftPlot == 0 && currentPlot == 0 && rightPlot ==0){
                flowerbed[i] = 1;
                planted++;
            }

            if(planted == n){
                return true;
            }
        }
        return false;
    }
}