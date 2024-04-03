import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int length = sizes.length;

        int maxFront = 0;
        int maxBack = 0;    
        if(sizes[0][0] < sizes[0][1]){
            maxFront = sizes[0][0];
            maxBack = sizes[0][1];
        }else{
            maxFront = sizes[0][1];
            maxBack = sizes[0][0];
        }
        
        for(int i = 0; i < length; i++){
            int num = 0;
            if(sizes[i][0] >= sizes[i][1]){
                num = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = num;
            }
            if(maxFront < sizes[i][0]){
                maxFront = sizes[i][0];
            }
            if(maxBack < sizes[i][1]){
                maxBack = sizes[i][1];
            }
        }
        
        int answer = maxFront*maxBack;
        return answer;
    }
}