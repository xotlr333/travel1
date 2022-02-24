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
        System.out.println(a.solution("aaAAcccbbbBB"));
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

    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        ArrayList<Character> List = new ArrayList<Character>();
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0 ; i < arr.length ; i++){
            map.put((int) arr[i], map.getOrDefault((int) arr[i], 0)+1);
        }

        while(!map.isEmpty()){
            int maxNumber = 0;
            int maxKey = 0;
            for(int key : map.keySet()){
                int value = map.get(key);
                if(value > maxNumber || (value == maxNumber && maxKey > key)) {
                    maxNumber = value;
                    maxKey = key;
                }
            }
            map.remove(maxKey);
            for(int i =0; i<maxNumber; i++){
                answer += (char) maxKey + "";
            }

        }
            return answer;
    }

}