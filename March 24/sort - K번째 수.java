//두번째 푼 코드인데 이번에도 같은 실수를 함.
//command 이중배열에만 집중하느라 답을 가지고 있는 array배열을 신경 쓰지 못했음.
//다음부터 코딩테스트 할 때는 종이에 필요 요소들을 차근히 적고 나서 진행하는 습관을 들일 것.

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int comLength = commands.length;
        
        int[] answer = new int[comLength];
        
        for(int i = 0; i < comLength; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];
            
            int[] temp = new int[end-start+1];
            int num = 0;
            for(int j = (start-1); j < end; j++){
                temp[num] = array[j];
                num++;
            }
            Arrays.sort(temp);
            answer[i] = temp[target-1];
        }

        return answer;
    }
}