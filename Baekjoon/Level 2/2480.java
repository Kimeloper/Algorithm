import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if(A == B && B == C && A == C){
            System.out.println(10000 + A * 1000);
        }else if(A == B || A == C){
            System.out.println(1000 + A * 100);
        }else if(B == C){
            System.out.println(1000 + B * 100);
        }else{
            System.out.println(Math.max(A, Math.max(B, C)));
        }
        sc.close();
    }
}


/*
      최댓값, 최솟값 구하기
        1.Math.max(a, b): a와 b 중 더 큰 값을 반환한다.
          ex) - System.out.println(Math.max(10, 12)); // 12 출력
              - System.out.println(Math.max(10, Math.max(1, 5))); // 10 출력

        2.Math.min(a, b): a와 b 중 더 작은 값을 반환한다.
          ex) - System.out.println(Math.min(10, 12)); // 10 출력
              - System.out.println(Math.min(10, Math.min(1, 5))); // 1 출력 

*/
