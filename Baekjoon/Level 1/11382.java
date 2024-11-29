import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.println(A + B + C);

        sc.close();
    }
}


/*
    1.  1 ≤ A, B, C ≤ 10¹² ( 1 ≤ A, B, C ≤ 1,000,000,000,000)여서 int형의 범위를 초과하는 숫자를
        입력받게될 수 있으므로 long형을 사용했다.
    
    2. int와 long의 범위

     int     4 byte     -2,147,483,648 ~ 2,147,483,647
     long    8 byte     -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
*/
