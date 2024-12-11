import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        int M = sc.nextInt();
        int temp;

        for(int a = 0 ; a < N ; a++){
            arr[a] = a + 1;
        }

        for(int a = 0 ; a < M ; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }

        for(int a = 0 ; a < N ; a++){
            System.out.print(arr[a] + " ");
        }

       sc.close();
    }
}
