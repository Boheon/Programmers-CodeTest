import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers12939 {
    public String solution(String s) {

        String[] numbers = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);

            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        String answer = min + " " + max;
        return answer;
    }
}
