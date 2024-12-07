import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }
        sc.close();
    }
}


/*
    hasNextInt(): 정수 데이터의 존재 여부에 따라 true, false 반환.
    hasNext(): 문자열, 정수, 공백 등 데이터의 존재 여부에 따라 true, false 반환.
   
 */
