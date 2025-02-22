import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int N =sc.nextInt();
       String arr[][] = new String[N][2];

       for(int i = 0 ; i < N ; i ++){
           arr[i][0] = sc.next(); //나이
           arr[i][1] = sc.next(); //이름
       }

       Arrays.sort(arr, new Comparator<String[]>() {
           @Override
           public int compare(String[] o1, String[] o2) { //나이를 비교하며 나이가 같은경우 먼저 입력된것이 먼저 출력된다. 
               return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
           }
       });

       for(int i = 0 ; i < N ; i++){
           System.out.println(arr[i][0] + " " + arr[i][1]);
       }

       sc.close();
    }
}

/*
    Comparator란?
    -객체의 정렬을 위한 메서드를 정의해주는 인터페이스. compare()메서드를 통해 두개의 객체값을 불러와 비교한다.
    ex) int compare(String o1, String o2)
    1. 첫번째 인자(o1)가 두번째 인자(o2)보다 작으면 -1반환
       -o1이 o2의 앞에 위치
    2. 첫번째 인자(o1)가 두번째 인자(o2)보다 크면 1 반환
       -o1이 o2의 뒤에 위치
    3. 첫번째 인자(o1)와 두번째 인자(o2)가 같으면 0 반환
       -위치 변경 안함
      
    즉 이번 문제 풀이를 보면
    int compare(String[] o1, String[] o2){} 문자열 o1과 o2를 비교하는데
    return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]) 여기서 o1[0]과 o2[0]은 나이인데 문자열로 입력되어서 Integer.parseInt를 통해 int형으로 바꿔준다.
    마mport java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int N =sc.nextInt();
       String arr[][] = new String[N][2];

       for(int i = 0 ; i < N ; i ++){
           arr[i][0] = sc.next(); //나이
           arr[i][1] = sc.next(); //이름
       }

       Arrays.sort(arr, new Comparator<String[]>() {
           @Override
           public int compare(String[] o1, String[] o2) { //나이를 비교하며 나이가 같은경우 먼저 입력된것이 먼저 출력된다. 
               return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
           }
       });

       for(int i = 0 ; i < N ; i++){
           System.out.println(arr[i][0] + " " + arr[i][1]);
       }

       sc.close();
    }
}


/*
    Comparator란?
    -객체의 정렬을 위한 메서드를 정의해주는 인터페이스. compare()메서드를 통해 두개의 객체값을 불러와 비교한다.
    ex) int compare(String o1, String o2)
    1. 첫번째 인자(o1)가 두번째 인자(o2)보다 작으면 -1반환
       -o1이 o2의 앞에 위치
    2. 첫번째 인자(o1)가 두번째 인자(o2)보다 크면 1 반환
       -o1이 o2의 뒤에 위치
    3. 첫번째 인자(o1)와 두번째 인자(o2)가 같으면 0 반환
       -위치 변경 안함
      
    이번 문제 풀이를 보면
    int compare(String[] o1, String[] o2) 문자열 o1과 o2를 비교하는데
    return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]) 여기서 o1[0]과 o2[0]은 나이인데 문자열로 입력되어서 Integer.parseInt를 통해 int형으로 바꿔준다.
    그리고 만약 o1[0]이 30, o2[0]이 25라면 30 - 25 = 5 양수가 나오니 o1[0]이 a2[0]뒤에 위치하겠다.
*/
