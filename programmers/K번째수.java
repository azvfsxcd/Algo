import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int[] arr = new int[commands[i][1]-commands[i][0]+1];
            int cnt = 0;
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++){
                arr[cnt++]= array[j];
                // System.out.println(arr[cnt-1]);
            }
            // System.out.println(arr[0]+" "+ arr[commands[i][2]-1]);
            Arrays.sort(arr);
             // System.out.println(arr[0]+" "+ arr[commands[i][2]-1]);
            answer[i] = arr[commands[i][2]-1];
        }
        
        return answer;
    }
}