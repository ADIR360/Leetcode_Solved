class Solution {
    private int findPosition(int[] nums, int target, boolean findFirst) {
        int low = 0, high = nums.length - 1;
        int position = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                position = mid;
                if (findFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return position;
    }

    public int[] searchRange(int[] nums, int target) {
        int firstPosition = findPosition(nums, target, true);
        int lastPosition = findPosition(nums, target, false);
        
        return new int[] { firstPosition, lastPosition };
    }
}
