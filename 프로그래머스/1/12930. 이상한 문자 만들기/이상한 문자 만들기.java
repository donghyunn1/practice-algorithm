class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int wordIndex = 0; // 단어 내 인덱스
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                sb.append(c);
                wordIndex = 0; 
            } else {
                if (wordIndex % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                wordIndex++;
            }
        }
        
        return sb.toString();
        }
}