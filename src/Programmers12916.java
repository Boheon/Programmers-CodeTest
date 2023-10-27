public class Programmers12916 {
    boolean solution(String s) {

        int pcount =0;
        int ycount =0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pcount++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                ycount++;
            }
        }

        return pcount == ycount;
    }

    boolean solution2(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        return count == 0;
    }

    boolean solution3(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
