import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x_list[] = new int[3];
        int y_list[] = new int[3];

        for(int i = 0 ; i < 3 ; i++){
            x_list[i] = sc.nextInt();
            y_list[i] = sc.nextInt();
        }

        int x;
        int y;

        if(x_list[0] == x_list[1]){
            x = x_list[2];
        }else if(x_list[0] == x_list[2]){
            x = x_list[1];
        }else{
            x = x_list[0];
        }

        if(y_list[0] == y_list[1]){
            y = y_list[2];
        }else if(y_list[0] == y_list[2]){
            y = y_list[1];
        }else{
            y = y_list[0];
        }

        System.out.println(x + " " + y);
     
        sc.close();
    }
}
