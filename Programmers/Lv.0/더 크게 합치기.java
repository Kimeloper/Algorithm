class Solution {
    public int solution(int a, int b) {
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        int AB = Integer.parseInt(A + B);
        int BA = Integer.parseInt(B + A);
        int answer = 0;
        
        if(AB > BA){
            answer += AB;
        }else{
            answer += BA;
        }
        
        return answer;
        
    }
}


/*
  1. 숫자에서 문자열로 변환
    - Integer.toString()
  2. 문자열에서 숫자로 변환
    - Integer.parseInt()
*/
