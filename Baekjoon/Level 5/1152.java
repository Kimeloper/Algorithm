import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.println(st.countTokens());

        sc.close();
    }
}


/*
    StringTokenizer: 지정한 구분자를 기준으로 문자열을 나누어주는 클래스다.
    countTokens(): StringTokenizer를 통해 나눠진 토큰의 개수를 반환하는 메서드다.

 */

