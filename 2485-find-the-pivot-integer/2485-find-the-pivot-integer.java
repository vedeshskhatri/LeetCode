class Solution {
    public int pivotInteger(int n) {
        // Total sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;

        // Iterate through possible pivot values
        int leftSum = 0;
        for (int x = 1; x <= n; x++) {
            leftSum += x; // sum from 1 to x
            int rightSum = totalSum - leftSum + x; // sum from x to n
            if (leftSum == rightSum) {
                return x;
            }
        }
        return -1; // no pivot found
    }
}
