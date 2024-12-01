import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0 && y > 0){ //x 양수, y 양수
            System.out.println("1");
        }else if(x < 0 && y > 0){//x 음수, y 양수
            System.out.println("2");
        }else if(x < 0 && y < 0){//x 음수, y 음수
            System.out.println("3");
        }else{//x 양수, y 음수
            System.out.println("4");
        }
        sc.close();
    }
}
