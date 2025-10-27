class Solution {
    public int[] solution(int brown, int yellow) {
        int[] arr = new int[2];
        int total = brown + yellow;
        
        for (int h = 3; h <= total; h++) {
            if (total % h == 0) {
                int w = total / h;
                
                if (w >= h) {
                    if ((w-2) * (h-2) == yellow) {
                        arr[0] = w;
                        arr[1] = h;
                    }
                }
            }
        }
        return arr;
    }
}