import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0 ; i < A ; i++){
            hs.add(sc.nextInt());
        }

        for(int i = 0 ; i < B ; i++){
            int BNum = sc.nextInt();
            if(hs.contains(BNum)){
                hs.remove(BNum);
            }else{
                hs.add(BNum);
            }
        }

        System.out.println(hs.size());

        sc.close();
    }
}
