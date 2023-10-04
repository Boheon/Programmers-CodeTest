import java.util.ArrayList;
import java.util.Arrays;

public class Programmers12910 {
    public int[] divisible(int[] array, int divisor) {
        int[] nothing = {-1};
        if(Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray().length != 0) {
            return Arrays.stream(array).filter(factor -> factor % divisor == 0).sorted().toArray();
        }
        else{
            return nothing;
        }
    }
}
