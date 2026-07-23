class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1 ; i < numLog.length;i++){
            if(numLog[i] - numLog[i-1] == 1){
                answer += "w";
            }else if(numLog[i] - numLog[i-1] == -1){
                answer += "s";
            }else if(numLog[i] - numLog[i-1] == 10){
                answer += "d";
            }else{
                answer += "a";
            }
        }
        return answer;
    }
}

/*
  문자열 길이를 구할 땐 length()로 쓰지만,
  배열의 길이를 구할 땐 length로 괄호()를 빼야한다.
*/
