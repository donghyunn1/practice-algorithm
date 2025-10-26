class Solution {
    public int[] solution(String s) {
        int transformCount = 0;
        int zeroCount = 0;
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            int originalLength = s.length();
            s = s.replace("0","");
            int newLength = s.length();
            
            zeroCount += originalLength - newLength;
            
            s = Integer.toBinaryString(newLength);
            
            transformCount++;
        } 
        answer[0] = transformCount;
        answer[1] = zeroCount;
        
        return answer;
    }
}