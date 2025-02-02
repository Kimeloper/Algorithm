import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();

        System.out.println(Integer.parseInt(N, B));

        sc.close();
    }
}

/*
    Integer.parseInt(String s, int radix)
    : 문자열을 숫자로 바꿔주는 메소드. radix로 표현된 s를 10진법으로 바꿔준다.

 */
