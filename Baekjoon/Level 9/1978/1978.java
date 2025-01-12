import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        for(int i = 0 ; i < N ; i++){
            int M = sc.nextInt();
            if(M == 1){ //1은 소수가 아님
                continue;
            }

            boolean bool = true;
            for(int j = 2; j < M; j++){
                if(M % j == 0) {//약수일땐 false로 변환
                    bool = false;
                }
            }
            if(bool == true){//소수일땐 1추가
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
