class Solution {
    public int solution(int a, int b) {
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        int AB = Integer.valueOf(A + B);
        int answer = 0;
       
        if (AB > 2 * a * b) {
            return answer = AB;
        } else {
            return answer = 2 * a * b;
        }
    }
}


/*
  1. int -> String 변환 메서드
     - Integer.toString()
     - String.valueOf()

  2. String -> int 변환 메서드
     - Integer.parseInt()
  
  3. String -> Integer 변환 메서드
     - Integer.valueOf()

  ※ int와 Integer의 차이!
     - int는 기본 자료형(Primitive Type)으로 정수 값을 저장하며 null 값을 가질 수 없다.
     - Integer는 참조 자료형(Wrapper Class)으로 int 값을 객체 형태로 감싼 클래스이며 null 값을 가질 수 있다.
     - int는 값을 직접 저장하지만, Integer는 정수 값을 담고 있는 객체를 참조하여 사용한다.

*/
