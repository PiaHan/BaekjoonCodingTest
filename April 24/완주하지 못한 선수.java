import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> athleteMap = new HashMap<>();
        for(int i = 0; i < participant.length; i++){
            athleteMap.put(participant[i], athleteMap.getOrDefault(participant[i], 0) + 1);
        }
    
        
        for(int i = 0; i < completion.length; i++){
             athleteMap.put(completion[i], athleteMap.get(completion[i]) - 1);
        }
        
        String answer = "";
        for (Map.Entry<String, Integer> entry : athleteMap.entrySet()) {
            String athlete = entry.getKey();
            int count = entry.getValue();
            if(count > 0){
                answer = athlete;
            }
           
        }
    
       
        return answer;
    }
}