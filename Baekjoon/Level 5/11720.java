import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();
        int sum = 0;

        for(int i = 0 ; i < N ; i++){
            sum += str.charAt(i)-'0'; 
        }

        System.out.println(sum);

        sc.close();
    }
}


/*
    문자         아스키코드
     0             48
     1             49
     2             50
     3             51
     4             52
     5             53
     6             54
     7             55
     8             56
     9             57
 */
