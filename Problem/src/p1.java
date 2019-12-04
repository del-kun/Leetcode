class Solution1{
    public int[] twoSum(int[] nums, int target) {
        int[] test = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target)
                {
                    test[0] = i;
                    test[1] = j;
                    break;
                }
            }
        }
        return test;
    }
}