import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        int myPocket = nums.length / 2;
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int number : nums) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        
        System.out.println("myPocket: " + myPocket);
        
        System.out.println("Frequency Map: " + frequencyMap);
        System.out.println("Frequency Map: " + frequencyMap.size());
        int answer = 0;
        if(frequencyMap.size() >= myPocket){
            answer = myPocket;
        }else{
            answer =  frequencyMap.size();
        }
        
        return answer;
    }
}