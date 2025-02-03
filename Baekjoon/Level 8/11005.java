import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(Integer.toString(N, B).toUpperCase());
        sc.close();
    }
}


/*
    -Integer.toString(int i, int radix): 숫자를 문자열로 바꿔주는 메소드. 10진법으로 된 숫자를 radix로 바꿔준다.
    -toUpperCase(): 소문자를 대문자로 변환해준다.
 */
