import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[26]; //a~z
        for(int i = 0 ; i < 26 ; i++){
            arr[i] = -1;
        }

        String S = sc.next();
        for(int i = 0 ; i < S.length(); i++){
            char ch = S.charAt(i);

            if(arr[ch - 'a'] == -1){
                arr[ch -  'a'] = i;
            }
        }

        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}


/*
    문자       아스키코드
     a            97
     b            98
     c            99
     d            100
     e            101
     f            102
     g            103
     h            104
     i            105
     j            106
     k            107
     l            108
     m            109
     n            110
     o            111
     p            112
     q            113  
     r            114
     s            115
     t            116
     u            117
     v            118 
     w            119
     x            120
     y            121
     z            122
*/
