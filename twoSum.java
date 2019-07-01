class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> hs = new HashMap<>();
        int result[]=new int[2];
        
        for (int i=0; i<nums.length; i++) {
            if (hs.containsKey(target-nums[i])) {
                result[0] = hs.get(target-nums[i]); 
                result[1] = i;
                return result;
            }
            hs.put(nums[i], i);
        }
        return result;
    }
}
