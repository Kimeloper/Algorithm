import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //올라가기
        int B = sc.nextInt(); //내려가기
        int V = sc.nextInt(); //나무막대 높이

        int result = (V - A) / (A - B);

        if((V - A) % (A - B) == 0){
            result += 1;
        }else{
            result += 2;
        }
        System.out.println(result);

        sc.close();
    }
}
