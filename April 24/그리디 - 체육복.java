import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        //System.out.println("lost length : " + lost.length);
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < reserve.length; i++){
            for(int j = 0; j < lost.length; j++){
                if(reserve[i] == lost[j]){
                    answer++;
                    lost[j] = -4;
                    reserve[i] = -2;
                }
            }
        }
        
        for(int i = 0; i < reserve.length; i++){
            for(int j = 0; j < lost.length; j++){
                  if(lost[j] == (reserve[i]+1) || lost[j] == (reserve[i]-1)){
                        answer++;
                         lost[j] = -4;
                        reserve[i] = -2;
                    }else{

                    }  
                } 
            }
        
        return answer;
    }
}