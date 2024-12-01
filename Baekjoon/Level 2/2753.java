import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0 ){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        sc.close();

    }
}


/*
         이 문제를 풀때 비교 연산자(==, !=)와 논리 연산자(&&, ||)를 사용했다.

         비교 연산자
            ==(Equal To)       A와 B가 같으면 true 반환
                               ex) int A = 10
                                   int B = 10
                                   System.out.println(A == B) //true
  
            !=(Not Equal To)   A와 B가 같지않으면 true 반환
                               ex) int A = 10
                                   int B = 15
                                   System.out.println(A != B) //true
  
            >(Greater Than)   A가 크면 true 반환
                               ex) int A = 15
                                   int B = 10
                                   System.out.println(A > B) //true
  
            <(Less Than)      B가 크면 true 반환
                               ex) int A = 10
                                   int B = 15
                                   System.out.println(A < B) //true
  
            >=(Greater than or Equal to)      A값이 크거나 같으면 true 반환
                                               ex) int A = 15
                                                   int B = 15
                                                   System.out.println(A >= B) //true
  
            <=(Less than or Equal to)         B값이 크거나 같으면 true 반환
                                                ex) int A = 10
                                                    int B = 10
                                                    System.out.println(A <= B) //true


         논리연산자
            &&(AND)     A와 B가 모두 true인 경우 true 반환
                        ex) true && true = true
                            true && false = false
                            false && true = false
                            false && false = false
  
            ||(OR)      A와 B중 하나만 true여도 true 반환
                        ex) true || true = true
                            true || false = true
                            false || true = true
                            false || false = false
             !(NOT)     true면 false를, false면 true 반환
                            !true = false
                            !false = true
  
             *이 문제에서는 !가 아닌 !=라는 비교연산자를 사용했다.
*/
