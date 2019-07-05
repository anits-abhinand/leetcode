class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 1; i <= nums.length; i++) {
            int ptr = i;
            if (nums[i-1] != 0) {
                ptr = nums[ptr-1];
                while(ptr > 0 && nums[ptr-1] != 0) {
                    int nptr = nums[ptr-1];
                    nums[ptr-1] = 0;
                    ptr = nptr;
                }
            }
        }
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] != 0) {
            l.add(i+1);
            }
        }
        return l;
    }
}
