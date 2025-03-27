import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int tree[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            tree[i] = sc.nextInt();
        }

        int gcd=0;

        for(int i = 0 ; i < N-1 ; i++){
            int distance = tree[i+1]- tree[i];
            gcd = gcd(distance,gcd);
        }

        System.out.println((tree[N-1] - tree[0]) / gcd + 1 - N);

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
