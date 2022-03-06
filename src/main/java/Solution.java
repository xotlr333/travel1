import java.util.*;

public class Solution {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int first = scanner.nextInt();
//        int second = scanner.nextInt();
//        int[] intArr = new int[first];
//        int num = 10;
//
//        for(int i = first ; i > 0 ; i--){
//            intArr[i-1] = second % num;
//            second = second / num;
//        }

        Solution a = new Solution();
        System.out.println(a.solution(6, new int[]{7,10}));
//        System.out.println(a.backjoon(first));

    }

    public long backjoon(int n){
        long answer = 0;
        int i = 0;
        if(n != 0 && n != 1) {
            long[] arr = new long[n+1];
            arr[0] = 0; arr[1] = 1;
            while (true) {
                arr[i + 2] = arr[i] + arr[i + 1];
                if (i + 2 == n) {
                    break;
                }
                i++;
            }
            answer = arr[n];
        }else if(n == 1){
            answer = 1;
        }else if(n == 0){
            answer = 0;
        }
        return answer;
    }

    //n = 6, times = {7, 10}
    public long solution(int n, int[] times) {
        long answer = 0;
        int cnt = 0;
        int i = 0;
        while(true){
            if(n == cnt){ break; }
            for(int j = 0; j < times.length; j++){

            }
        }

        return answer;
    }

}