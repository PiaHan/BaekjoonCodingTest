class Solution {
    public int solution(String s) {
        String[] sArray = s.split(" ");
        
        int answer = Integer.parseInt(sArray[0]);
        
        for(int i = 1; i < sArray.length; i++){
            String prior = sArray[i-1];
            if(sArray[i].equals("Z")){
                answer -= Integer.parseInt(prior);
            }else{
                answer += Integer.parseInt(sArray[i]);
            }
        }
        
        
        
        return answer;
    }
}