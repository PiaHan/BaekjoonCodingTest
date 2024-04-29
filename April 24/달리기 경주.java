import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        
       for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
       }
        
        for(String player : callings){
            int winnerNum = map.get(player);
            String loser = players[winnerNum-1];
            
            players[winnerNum-1] = player;
            players[winnerNum] = loser;
            
            map.put(player, winnerNum-1);
            map.put(loser, winnerNum);
            
        }
        
        
        return players;
    }
}