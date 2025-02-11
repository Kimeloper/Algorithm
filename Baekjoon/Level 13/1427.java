import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int arr[] = new int[str.length()];

        for(int i = 0 ; i < str.length(); i++){
            arr[i] = str.charAt(i) - '0';
        }

        Arrays.sort(arr);

        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
        
        sc.close();
    }
}
