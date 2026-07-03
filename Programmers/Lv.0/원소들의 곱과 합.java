class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int product = 1;
        int sum = 0;
       
        for(int i = 0 ; i < num_list.length; i++){
            product *= num_list[i];
        }
        
        for(int j = 0 ; j < num_list.length; j++){
            sum += num_list[j];
        }
        
        if(product > sum * sum){
            answer = 0;
        }else{
            answer = 1;
        }
        
        return answer;
    }
}
