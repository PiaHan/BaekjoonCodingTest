import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<Integer, String> map = new HashMap<>();
       for(int i = 0; i < players.length; i++){
            map.put(i+1, players[i]);
       }
        
        for(int i = 0; i < callings.length; i++){
            String winner = callings[i];
            for(int j = 1; j < players.length+1; j++){
                if(map.get(j).equals(winner)){
                    int winnerNum = j-1;
                    int loserNum = j;
                    String loser = map.get(j-1);
//                     System.out.println("-------------------" + j);
//                     System.out.println("winner : " + winner);
//                     System.out.println("loser : " + loser);
                    
                    map.replace(winnerNum, winner);
                    map.replace(loserNum, loser);
                    
                    // System.out.println("map : " + map);
                    // System.out.println("------------------------");
                    break;
                }
            }
        }
        
        String[] answer = new String[players.length];
        //System.out.println(map);
        
        for(int i = 0; i < players.length; i++){
            answer[i] = map.get(i+1);    
        }
        
        return answer;
    }
}
