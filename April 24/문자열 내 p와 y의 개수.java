import java.util.*;

class Solution {
    boolean solution(String s) {
        String[] sArray = s.split("");
        
        int pCnt = 0;
        int yCnt = 0;
        for(int i = 0; i < sArray.length; i++){
            if(sArray[i].equals("p") || sArray[i].equals("P")){
                pCnt++;
            }else if(sArray[i].equals("y") || sArray[i].equals("Y")){
                yCnt++;
            }else{}
        }
        
        boolean answer = true;
        if(pCnt == yCnt){
            
        }else{
            answer = false;
        }

        return answer;
    }
}