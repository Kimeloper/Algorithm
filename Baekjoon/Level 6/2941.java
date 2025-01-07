import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i = 0 ; i < arr.length; i++) {

            if(str.contains(arr[i])){
                str = str.replace(arr[i], "?"); //입력한 문자열에 arr 배열에 있는 문자와 일치하면 ?로 바꾸기
            }
        }
        System.out.println(str.length());
        sc.close();
    }
}


/*

    - contain() : 문자열에 특정 문자가 포함되어있는지 확인한다.
    - replace() : 특정 문자를 원하는 문자로 바꿔준다.

*/
