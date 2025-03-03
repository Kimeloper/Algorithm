import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //가지고있는 카드숫자
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0 ; i < N ; i++){
            hs.add(sc.nextInt());
        }

        int M = sc.nextInt(); //확인할 카드숫자
        for(int i = 0 ; i < M ; i++){
            if(hs.contains(sc.nextInt())){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }
        }

        sc.close();
    }
}


/*

    HashSet이란?
    -set인터페이스에서 지원하는 구현클래스로 중복을 허용하지않고 순서 상관없이 저장된다.
     contains() 메서드를 사용하면 값이 있으면 true, 없으면 false를 반환한다.
 */
