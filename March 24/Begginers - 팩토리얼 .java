class Solution {
    public int solution(int n) {
        int[] ansList = new int[11];
        
        ansList[0] = 0;
        ansList[1] = 1;
        ansList[2] = 2;
        int answer = 0;
        
        if(n == 0){
            
            return answer;
        }else if(n == 1){
            answer = 1;
            return answer;
        }else if(n == 2){
            answer = 2;
            return answer;
        }
        
        for(int i = 3; i < 11; i++){
            ansList[i] = (i)*ansList[i-1];
            System.out.println(i + " : " + ansList[i]);
            if(ansList[i] > n){
                answer = i-1;
                return answer;
            }else if(ansList[i] == n){
                answer = i;
                return answer;
            }
        } 
        
     return answer;


    }
}