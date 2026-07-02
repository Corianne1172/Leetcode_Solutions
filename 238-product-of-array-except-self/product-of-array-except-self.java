class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] prefix_array = new int[nums.length];
        int[] suffix_array = new int[nums.length];
        prefix_array[0] = 1;
        suffix_array[suffix_array.length-1] = 1;

        for(int i = 1; i < nums.length; i++){
            prefix_array[i] = prefix_array[i-1] * nums[i-1];
        }

        for(int i = nums.length -2; i >= 0; i--){
            suffix_array[i] = suffix_array[i+1] * nums[i+1];
        }

        for(int j = 0; j < answer.length; j++){
            answer[j] = prefix_array[j] * suffix_array[j];
        }

        return answer;
    }
}