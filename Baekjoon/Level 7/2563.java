import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[][] = new int[101][101];

        //색종이 면적만큼 1넣기(도화지에 색종이 붙이기)
        for(int i = 0 ; i < N ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x ; j < x + 10 ; j++){
                for(int k = y ; k < y + 10 ; k++){
                    arr[k][j] = 1;
                }
            }
        }

        //1개수 세기(면적 구하기)
        int count = 0;
        for (int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 100 ; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
