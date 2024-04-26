import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] my_Array = my_string.split("");
        for(int i = 0; i < my_Array.length; i++){
            for(int j = 0; j < i; j++){
                if(my_Array[i].equals(my_Array[j])){
                    my_Array[i] = "";
                }
            }
        }
        
        String answer = String.join("", my_Array);
        return answer;
    }
}
