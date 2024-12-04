import java.io.*;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); //문자를 숫자로 변환
            int B = Integer.parseInt(st.nextToken());

            bw.write(A + B+"\n");

        }
        bw.flush();
        bw.close();

    }
}

/*
   1. 속도 제한이 있는 문제이기에 Scanner를 사용하면 시간초과가 뜬다.
     따라서 Scanner대신 속도가 가장 빠른 조합인 BufferedReader + BufferedWriter를 사용하였다.

   2. StringToknize란?
      -입력된 문자열(String)을 토큰(단어)으로 나눠준다.
       ex) "Hello World!" -> "Hello" , "World!"
      -Integer.parseInt()을 사용하여 문자열, 문자를 숫자로 변환가능하다.
 */
