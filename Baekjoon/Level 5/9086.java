import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String arr[]  = new String[T];

        for(int i = 0 ; i < T ; i++){
            arr[i]= sc.next();
        }

        for(int i = 0 ; i < T ; i++){
            System.out.println(arr[i].charAt(0)+""+arr[i].charAt(arr[i].length()-1)); // ""를 안쓰면 아스키코드 값이 더해진다.
        }

        sc.close();
    }
}
