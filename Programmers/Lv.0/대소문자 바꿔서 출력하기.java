import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        
        for(int i = 0 ; i < a.length(); i++){
            char ch = a.charAt(i);
            
            if(Character.isUpperCase(ch)){
                str += Character.toLowerCase(ch);
            }else{
                str += Character.toUpperCase(ch);
            }
        }
        System.out.print(str);
    }
}

/*
  Character.isUpperCase() : 문자가 대문자인지 판별하는 메소드
  Character.isLowerCase() : 문자가 소문자인지 판별하는 메소드

  Character.toUpperCase() : 문자를 대문자로 변환하는 메소드
  Character.toLowerCase() : 문자를 소문자로 변환하는 메소드
*/
