package com.cybertek.InterviewQuestions;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacterByMap {
    public static void main(String[] args) {


        String str = "Java is best of the best";
        Map<Character,Integer> M = new HashMap<>();
        for (Character each : str.toCharArray()) {
            if(M.containsKey(each)) {
                M.put(each,M.get(each)+1);
            } else {
                M.put(each,1);
            }

        }
        System.out.println(M);

    }
}