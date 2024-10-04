class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;  
        }

        int low = 1, high = x / 2;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long squared = (long) mid * mid; 

            if (squared == x) {
                return mid;
            } else if (squared < x) {
                result = mid;  
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        return result; 
    }
}
