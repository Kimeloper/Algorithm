import java.util.*;

public class Main {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0 ; i < T ; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println((A * B) / gcd(A, B));
        }
    } 

    public static int gcd(int A , int B){
        if (B == 0) {
            return A;
        }else{
            return gcd(B, A % B);
        }
    }
}

/*
    -GCD란? 최대공약수를 의미한다.
    -유클리드 호제법이란? 두 수의 최대공약수를 빠르게 알아내는 알고리즘
    -유클리드 호제법 공식 - GCD(A, B) = GCD(B, A % B) 
      *여기서 나머지가 0이 나올때 B가 최대공약수가 된다!
    
*/
