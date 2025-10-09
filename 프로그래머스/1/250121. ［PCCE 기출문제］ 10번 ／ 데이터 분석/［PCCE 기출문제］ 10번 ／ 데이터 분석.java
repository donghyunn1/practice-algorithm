import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIndex = getIndex(ext);
        int sortIndex = getIndex(sort_by);
        
        List<int[]> filteredList = new ArrayList<>();
        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                filteredList.add(row);
            }
        }
        
        filteredList.sort((a,b) -> a[sortIndex] - b[sortIndex]);
        
        int[][] answer = new int[filteredList.size()][];
        
        for (int i = 0; i < filteredList.size(); i++) {
            answer[i] = filteredList.get(i);
        }
        
        return answer;
    }
    
    private int getIndex(String field) {
        switch(field) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
            default: return -1;
        }
    }
}