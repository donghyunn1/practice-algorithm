import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> wantMap = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        int answer = 0;
        
        for (int start = 0; start <= discount.length - 10; start++) {
            HashMap<String, Integer> countMap = new HashMap<>();
            
            for (int i = start; i < start + 10; i++) {
                String name = discount[i];
                countMap.put(name, countMap.getOrDefault(name, 0) + 1);
            }
            
            if (wantMap.equals(countMap)) {
                answer++;
            }
        }
        
        return answer;
    }
}