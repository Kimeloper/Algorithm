import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int i = sc.nextInt();

        System.out.println(S.charAt(i-1));
        sc.close();
    }
}


/*
   charAt(): 문자열에서 주어진 인덱스에 있는 문자를 반환한다.
    ex) String str = "Hello World!";
        System.out.println(str.charAt(6)); // W
*/
