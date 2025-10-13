class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        int length = arr.length;
        
        for (int data : arr) {
            sum += data;
        }
        
        return (double) sum / length;
    }
}