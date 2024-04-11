class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split("");
        String[] arrNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arrNum.length; j++){
                if(arr[i].equals(arrNum[j])){
                    sum += Integer.parseInt(arr[i]); 
                }
            }
        }
        int answer = sum;
        //System.out.println("answer : " + answer);
        return answer;
    }
}