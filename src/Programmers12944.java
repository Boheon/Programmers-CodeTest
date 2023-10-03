import java.util.Arrays;

public class Programmers12944 {
    public static double solution(int[] arr) {
        double answer = 0;
        answer = (double) Arrays.stream(arr).sum() /arr.length;
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }
}
