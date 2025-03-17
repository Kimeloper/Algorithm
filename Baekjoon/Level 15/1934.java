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
