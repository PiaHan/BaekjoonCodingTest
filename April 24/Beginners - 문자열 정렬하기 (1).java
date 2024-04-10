import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue; 

class Solution {
    public int[] solution(String my_string) {
        String[] arr = my_string.split("");
        String[] arrNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        Queue<Integer> answerTemp = new LinkedList<>();
        
        int ansNum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arrNum.length; j++){
                if(arr[i].equals(arrNum[j])){
                    answerTemp.add(Integer.parseInt(arr[i])); 
                    ansNum++;
                }
            }
        }
        int[] answer = new int[ansNum];
        for(int i = 0; i < ansNum; i++){
            answer[i] = answerTemp.poll();  
        }
        
        Arrays.sort(answer);
        return answer;
    }
}