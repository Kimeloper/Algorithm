import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        boolean arr[] = new boolean[N];
        boolean check = true;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            String str = sc.nextLine();
            arr[str.charAt(i) - 97] = true;
            for(int j = 1; j < str.length(); j++){
                char ch = str.charAt(j);
                if(ch == str.charAt(j - 1))
                    continue;
                if(arr[ch - 97]){
                    count--;
                    break;
                }
                arr[ch - 97] = true;
            }
        }
        System.out.println(count);
    }
}
