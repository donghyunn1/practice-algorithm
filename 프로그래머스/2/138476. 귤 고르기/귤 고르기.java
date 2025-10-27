import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int tang : tangerine) {
            map.put(tang, map.getOrDefault(tang, 0) + 1);
        }
        List<Integer> countValue = new ArrayList<>(map.values());
        
        countValue.sort(Collections.reverseOrder());
        
        int sum = 0;
        int count = 0;
        for (int i = 0; i < countValue.size(); i++) {
            sum += countValue.get(i);
            count++;
            
            if (sum >= k) {
                break;
            }
        }
        return count;
    }
}