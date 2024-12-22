import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        if (A > B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }

        sc.close();
    }
}


/*
       -StringBuilder(): 문자열 수정을 가능하게 한다.
       -append()는 숫자를 문자열로 변환한다.
       -reverse(): 문자열 안에 순서 뒤집는다.
       -toString(): 정수에서 문자열로 변환한다.
 */
