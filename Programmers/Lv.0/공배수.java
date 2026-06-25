class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        if(number % n == 0 && number % m == 0){
            answer += 1;
        }else{
            answer += 0;
        }
        
        return answer;
    }
}


/*
 AND(&&) : 두 조건이 모두 ture일 때, true를 반환한다.
*/
