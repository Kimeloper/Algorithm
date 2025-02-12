import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < N ; i++){
            sb.append(arr[i] + "\n");
        }

        System.out.println(sb.toString());

        sc.close();
    }
}


/*
     -StringBuilder(): 문자열을 결합하거나 수정할때 사용한다.
     -append(): 문자열을 결합하거나 숫자를 문자열로 변환한다.
 */
