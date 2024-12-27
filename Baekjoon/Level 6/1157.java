import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int arr[] = new int[26];

        for(int i = 0 ; i < str.length() ; i++){
            if(65 <= str.charAt(i) && str.charAt(i) <= 90){//A~Z(65~90)
                arr[str.charAt(i) -65]++;
            }else{//a~z(97~122)
                arr[str.charAt(i) - 97]++;
            }
        }
      
        int max = 0;
        char ch = '?';

        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] > max){
                max = arr[i];
                ch  = (char)(i + 65); //숫자를 문자로 변환
            }else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
