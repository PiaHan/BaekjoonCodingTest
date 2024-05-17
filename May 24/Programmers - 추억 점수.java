import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> longing = new HashMap<String, Integer>();
        for(int i = 0; i < yearning.length; i++){
            longing.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++){  
            for(int j = 0; j < photo[i].length; j++){
                if(longing.get(photo[i][j]) != null){
                    answer[i] +=  longing.get(photo[i][j]);
                }
            }
        }
        
        
        return answer;
    }
}
