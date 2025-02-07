import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 1;
        int num = 666;

        while(count < N){
            num ++;

            if(String.valueOf(num).contains("666")){//num에 666이 들어가면 1씩증가
                count++;
            }
        }
        System.out.println(num);

        sc.close();
    }
}


/*
    String.valueOf(): 괄호안에 들어간 타입을 String 타입으로 변환시킨다.
    contains():괄호안에 들어가있는 특정 문자열이 포함되는지 확인한다.
 */
