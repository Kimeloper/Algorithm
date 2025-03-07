import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        HashSet<String> hs = new HashSet<String>();

        for(int i = 0 ; i < str.length(); i++){
            for(int j = i + 1 ; j <= str.length(); j++){
                hs.add(str.substring(i,j));
            }
        }
      
        System.out.println(hs.size());

        sc.close();
    }
}
