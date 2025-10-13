class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int length = str.length();
        
        int[] arr = new int[length];
        
        int i = 0;
        while (n != 0) {
            arr[i] = (int) (n % 10);
            n = n / 10;
            i++;
        }
        
        return arr; 
    }
}