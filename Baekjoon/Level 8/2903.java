import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Dot = 2;

        for(int i = 0 ; i < N ; i++){
            Dot += Dot-1;
        }

        System.out.println(Dot*Dot);

        sc.close();

    }
}
