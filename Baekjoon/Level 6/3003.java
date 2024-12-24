import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int B = sc.nextInt();
        int Kn = sc.nextInt();
        int P = sc.nextInt();

        System.out.print(1 - K + " ");
        System.out.print(1 - Q + " ");
        System.out.print(2 - R + " ");
        System.out.print(2 - B + " ");
        System.out.print(2 - Kn + " ");
        System.out.print(8 - P);

        sc.close();
    }
}
