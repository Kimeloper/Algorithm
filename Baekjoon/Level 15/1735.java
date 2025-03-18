import java.util.*;

public class Main {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1
        int A = sc.nextInt();
        int B = sc.nextInt();

        //2
        int C = sc.nextInt();
        int D = sc.nextInt();

        int num = (A * D) + (C * B);
        int den = B * D;
        int gcd = gcd(num, den);

        System.out.println(num/gcd + " " + den/gcd);

        sc.close();

    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}
