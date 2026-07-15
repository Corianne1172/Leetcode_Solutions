class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int highestCandyAmount = candies[0];
        for(int i=1; i < candies.length; i++){
            if (candies[i] > highestCandyAmount){
                highestCandyAmount = candies[i];
            }
        }
        for(int i=0; i < candies.length; i++){
            if (candies[i] + extraCandies >= highestCandyAmount){
                result.add(true);
            }
            else{
                result.add(false);
            }            
        }
        return result;
    }
}