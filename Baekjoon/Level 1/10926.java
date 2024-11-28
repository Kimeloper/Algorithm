import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(str + "??!");

        sc.close();

    }
}


/*
          1. next()와 nextLine()의 차이점
              - next(): 공백 전까지의 문자열 즉, 첫번째 단어를 반환한다.
                      ex) Hello World! 입력시 Hello 출력
              - nextLine(): 공백을 포함한 문자열 전체를 반환한다.
                      ex) Hello World! 입력시 Hello World! 출력
            
                  
           2. 주의할점
              - nextLine()은 개행문자를 무시하지 않아 버퍼에 남겨두지 않지만,
                next(), nextInt(), nextDouble()등은 개행문자를 무시해 버퍼에 남겨둔다.
                이러한 부분을 고려하지 않는경우 문제가 발생하게 된다.
                ex)
                    Scanner sc = new Scanner(System.in);
                    String str1 = sc.next();
                    String str2 = sc.nextLine();

                    System.out.println(str1);
                    System.out.println(str2);
                    sc.close();

                    이렇게 될경우, next()에서 남긴 개행문자(\n)를 nextLine()이 읽고 개행해버려
                    입력받지 못하고 공백이 출력돼버린다. 이럴때 해결방법은

                    String str1 = sc.next();
                    sc.nextLine();
                    String str2 = sc.nextLine();

                    사이에 sc.nextLine()을 넣어 \n을 읽게 만들면 된다!

*/
