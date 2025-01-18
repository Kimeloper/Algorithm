import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x_list[] = new int[N];
        int y_list[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            x_list[i] = sc.nextInt();
            y_list[i] = sc.nextInt();
        }

        Arrays.sort(x_list);
        Arrays.sort(y_list);

        System.out.println((x_list[N-1] - x_list[0])* (y_list[N-1] - y_list[0]));
        sc.close();
    }
}

/*
    Arrays.sort(): 배열을 오름차순으로 정렬한다
 */
