import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.println(lcm(A, B));
    }

    public static long gcd(long A, long B){
        if(B == 0){
            return A;
        }else{
            return gcd(B, A % B);
        }
    }

    public static long lcm(long A, long B){
        return (A * B)/gcd(A, B);
    }

}


/*
    -GCD란? 최대공약수를 의미한다.
    -유클리드 호제법이란? 두 수의 최대공약수를 빠르게 알아내는 알고리즘
    -유클리드 호제법 공식 - GCD(A, B) = GCD(B, A % B) 
      *여기서 나머지가 0이 나올때 B가 최대공약수가 된다!

    -LCM이란? 최소공배수를 의미한다.
      *최소공배수는 최대공약수를 이용해서 구하면 되는데, 두 수의 곱/최대공약수 ((A*B)/gcd(A,B))를 하면된다.
    
    
*/
