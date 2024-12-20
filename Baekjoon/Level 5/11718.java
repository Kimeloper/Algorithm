import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String str = sc.nextLine();
          
            System.out.println(str);
        }

        sc.close();
    }
}


/*
     hasNextLine(): 다음에 읽을 값이 있면 true, 없으면 false를 반환한다.
 */
