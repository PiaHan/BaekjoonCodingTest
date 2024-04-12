import java.util.*;


class Solution {
    public int[] solution(int n) {
        
        Queue<Integer> stack = new LinkedList<>();
        
        int prime = 2;
        int nNum = n;
        
        while(prime <= n || nNum != 1) {
            if(nNum % prime == 0){
                nNum = nNum / prime;
                if(stack.size() == 0){
                    stack.add(prime);
                }else if (stack.peek() != prime){
                    stack.add(prime);
                }
            }else{
                prime++;
            }
        }
        int[] answer = new int[stack.size()];
        int t = 0;
        while (!stack.isEmpty()) {
            answer[t] = stack.poll();
            t++;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}