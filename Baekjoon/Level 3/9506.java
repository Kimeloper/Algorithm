import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while(true){
            int sum = 0;
            int n = sc.nextInt();
          
            if(n == -1){
                break;
            }
          
            StringBuilder sb = new StringBuilder();

            for(int i = 1 ; i < n ; i++){
                if(n % i == 0){
                    sb.append(i + " + ");
                    sum += i;
                }
            }

            if(sum == n){
                sb.setLength(sb.length() - 3); // " + "의 문자열 길이가 3이므로
                System.out.println(n + " = " + sb);
            }else{
                System.out.println(n + " is NOT perfect.");
            }
        }
        sc.close();
    }
}
