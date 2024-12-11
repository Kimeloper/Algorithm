import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int arr[] = new int[31];//1~30

       for(int i = 0 ; i < 28 ; i++){//과제 제출한 사람에게 1부여
          int a = sc.nextInt();
          arr[a] = 1;
       }

       for(int i = 1; i < 31 ; i ++){//30명중 1이 아닌사람 출력
           if(arr[i] != 1){
               System.out.println(i);
           }
       }
       sc.close();
    }
}
