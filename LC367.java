class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        
        long low = 2, high = num / 2;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long squared = mid * mid;
            
            if (squared == num) {
                return true;
            } else if (squared < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return false;
    }
}
