import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // N/4만큼 반복하여 long을 출력한다. 즉, N/4의 몫이 long의 개수다. 
        for(int i = 0; i < N/4 ; i++){
            System.out.print("long ");
        }

        System.out.println("int");

        sc.close();
    }
}
