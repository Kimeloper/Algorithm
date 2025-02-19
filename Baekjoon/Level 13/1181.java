import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String arr[] = new String[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){ //길이가 같으면 사전순으로 
                    return o1.compareTo(o2);
                }else{ //양수가 나오면 o1, 음수가 나오면 o2가 앞으로 이동
                    return o1.length()-o2.length();
                }
            }
        });

        System.out.println(arr[0]);

        for(int i = 1 ; i < N ; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
      sc.close();
    }
}
