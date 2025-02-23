import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[][] = new int[N][2];

        for(int i = 0 ; i < N ; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();

        }

        Arrays.sort(arr,(a, b) -> {
            if (a[0] == b[0]) { //x좌표끼리 같으면
                return a[1] - b[1];
            } else { //x좌표끼리 다르
                return a[0] - b[0];
            }
        });

        for(int i = 0 ; i < N ; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        sc.close();
    }
}


/*
  람다식(lambda expression): 메서드를 하나의 식으로 표현

  if (a[0] == b[0]): x좌표끼리 같을때
  a[1] - b[1]: a의 y와 b의 y를 빼준다.
  1. a[1]이 b[1]보다 작으면 음수반환
     -a[1]이 앞에온다.
  2. a[1]이 b[1]보다 크면 양수반환
     -a[1]이 뒤로간다.
  3. a[1]이 b[1]와 같으면 0반환
      -위치 변경 안함
*/
