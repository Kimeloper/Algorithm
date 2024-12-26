import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1 ; i >= 0; i--){//뒤집기
            sb.append(str.charAt(i));
        }

        if(str.equals(sb.toString())){//원래 문자열과 뒤집은 문자열 비교
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}


/*
     -StringBuilder(): 문자열 수정을 가능하게 한다.
     -append()는 숫자를 문자열로 변환한다.
 */
