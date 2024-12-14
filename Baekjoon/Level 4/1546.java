import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();
        double arr[] = new double[N];
        double M = arr[0];
        double score = 0;
        
        for(int i = 0 ; i < N ; i++){//성적입력
            arr[i] = sc.nextInt();

            if(M  < arr[i]){//최댓값 구하기
                M = arr[i];
            }
        }
        for(int i = 0 ; i < N ; i++){//가짜 점수 구하기
            score += arr[i]/M * 100;
        }

        System.out.println(score/N); //평균 출력

        sc.close();
    }
}
