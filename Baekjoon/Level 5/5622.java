import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;

        for(int i = 0 ; i < str.length(); i++) {
            switch (str.charAt(i)) {
                //2번
                case 'A':
                case 'B':
                case 'C':
                    count += 3;
                    break;
                //3번
                case 'D':
                case 'E':
                case 'F':
                    count += 4;
                    break;
                //4번
                case 'G':
                case 'H':
                case 'I':
                    count += 5;
                    break;
                //5번
                case 'J':
                case 'K':
                case 'L':
                    count += 6;
                    break;
                //6번
                case 'M':
                case 'N':
                case 'O':
                    count += 7;
                    break;
                //7번
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    count += 8;
                    break;
                //8번
                case 'T':
                case 'U':
                case 'V':
                    count += 9;
                    break;

                //9번
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    count += 10;
                    break;
            }
        }
        System.out.println(count);
    }
}

