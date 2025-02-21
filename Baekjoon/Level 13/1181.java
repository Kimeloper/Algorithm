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
     if(o1.length() == o2.length()){  return o1.compareTo(o2); }
     이거는 o1와 o2의 길이가 같을때 알파벳을 비교해서 순서를 결정한다는것이다. 예를들어 ABC와 BCD를 비교하면 A가 먼저오니 ABC가 BCD의 앞에 오겠다.
     
     else{ return o1.length()-o2.length(); }
     문자의 길이가 다를때, o1의 길이와 o2길이를 비교해서 순서를 결정한다는것이다. 예를들어 ABC - DEFG를 비교하면 3 - 4이니 -1 음수가 나오니 ABC가 DEFG의 앞에 오겠다.
*/
