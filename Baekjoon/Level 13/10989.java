import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < N ; i++){
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);

        br.close();
    }
}


/*
     -StringBuilder(): 문자열을 결합하거나 수정할때 사용한다.
     -append(): 문자열을 결합하거나 숫자를 문자열로 변환한다.
 */
