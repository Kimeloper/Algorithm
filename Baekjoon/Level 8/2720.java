import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //테스트 케이스 개수
        int C[] = new int[T];
        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;

        for(int i = 0 ; i < T ; i++) {
            C[i] = sc.nextInt();
            System.out.print(C[i] / Quarter + " ");//  124/25 = 4
            C[i] %= Quarter;//24
            System.out.print(C[i] / Dime + " ");// 24/10 = 2
            C[i] %= Dime;//4
            System.out.print(C[i] / Nickel + " ");// 4/5 = 0
            C[i] %= Nickel;//4
            System.out.println(C[i] / Penny);//4/1 = 4
        }

        sc.close();
    }
}
