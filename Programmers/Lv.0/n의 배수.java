class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        
        if(num % n == 0){
            answer += 1;
        }else{
            answer += 0;
        }
        return answer;
    }
}


/*
  num을 n으로 나눴을 때 나머지가 0이면 num은 n의 배수이다.
*/
