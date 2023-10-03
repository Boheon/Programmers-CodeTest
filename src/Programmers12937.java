public class Programmers12937 {
    public String solution(int num) {
        String answer = "";
        int last = num % 2;

        if(last != 0){
            answer = "Odd";
        }
        else {
            answer = "Even";
        }

        return answer;
    }
}
