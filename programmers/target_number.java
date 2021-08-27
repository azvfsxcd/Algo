import java.io.*;
import java.util.*;

class Solution {
    static int answer;
    static int[] cal;
    static int size;

    public int solution(int[] numbers, int target) {
        answer = 0;
        size = numbers.length;
        cal = new int[size];

        // 0 = - , 1 = +
        dfs(numbers, target, 0);
        return answer;
    }
    
    static void dfs(int[] numbers, int target, int d){
        if(d==size){
            int c = 0;
            for(int i =0; i<size; i++){
                if(cal[i]==0){
                    c -= numbers[i];
                } else{
                    c += numbers[i];
                }
            }
            if(c==target)   answer++;
            return;
        }
        for(int i =0 ; i <2 ; i++){
            cal[d] = i;
            dfs(numbers, target, d+1);
        }
    }

}