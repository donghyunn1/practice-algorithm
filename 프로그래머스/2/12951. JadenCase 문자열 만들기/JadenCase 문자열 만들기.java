class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean b = true;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                answer.append(c);
                b = true;
            } else {
                if (b) {
                    if (Character.isLetter(c)) {
                        answer.append(Character.toUpperCase(c));
                    } else {
                        answer.append(c);
                    }
                    b = false;
                } else {
                    if (Character.isLetter(c)) {
                        answer.append(Character.toLowerCase(c));
                    } else {
                        answer.append(c);
                    }
                }
            }
        }
        
        return answer.toString();
    }
}