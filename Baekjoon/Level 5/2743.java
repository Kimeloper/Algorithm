import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str.length());

        sc.close();

    }
}


/*
  length(): 문자열의 길이를 반환한다.
   ex) String str = "Hello World!";
       System.out.println(str.length()); //12
*/
