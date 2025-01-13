import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M =sc.nextInt();//M이상
        int N = sc.nextInt();//N이하
        int sum = 0;
        int min = N;

        for(int i = M ; i <= N; i++){

          boolean bool = true;
          if(i == 1){
              bool = false;
          }
          for(int j = 2 ; j < i ; j++){
              if(i == 1){//1은 소수가 아니다
                  break;
              }
             if(i % j == 0){//약수일땐 false로 변환
                 bool = false;
             
             }
          }
             if(bool == true){//소수일때
                 sum += i;
                 if(min > i){
                     min = i ;
                 }
             }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
        sc.close();
    }
}
