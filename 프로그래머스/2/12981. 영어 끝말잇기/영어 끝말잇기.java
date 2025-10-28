import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> userWords = new HashSet<>();
        userWords.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1];
            String currWord = words[i];
            
            if (userWords.contains(currWord) || prevWord.charAt(prevWord.length() - 1) != currWord.charAt(0)) {
                int person = i % n + 1;
                int turn = i / n + 1;
                
                answer[0] = person;
                answer[1] = turn;
                return answer;
            }
            userWords.add(currWord);
        }
        return answer;
    }
}