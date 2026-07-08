class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();

        if (nums.length == 0) {
            return list;
        }

        int currentRangeStart = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (currentRangeStart == nums[i - 1]) {
                    list.add(String.valueOf(currentRangeStart));
                } else {
                    list.add(currentRangeStart + "->" + nums[i - 1]);
                }

                currentRangeStart = nums[i];
            }
        }

        if (currentRangeStart == nums[nums.length - 1]) {
            list.add(String.valueOf(currentRangeStart));
        } else {
            list.add(currentRangeStart + "->" + nums[nums.length - 1]);
        }

        return list;
    }
}