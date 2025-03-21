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
