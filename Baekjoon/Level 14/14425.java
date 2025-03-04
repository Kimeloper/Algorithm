import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;

        HashSet<String> hs = new HashSet<String>();

        for(int i = 0 ; i < N ; i++){
            hs.add(sc.next());
        }

        for(int i =0 ; i < M ; i++){
            if(hs.contains(sc.next())){
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}


/*

    HashSet이란?
    -set인터페이스에서 지원하는 구현클래스로 중복을 허용하지않고 순서 상관없이 저장된다.
     contains() 메서드를 사용하면 값이 있으면 true, 없으면 false 를 반환한다.
 */
