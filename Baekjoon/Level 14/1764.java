import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        HashSet<String> hs = new HashSet<String>();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0 ; i < N ; i ++){
            hs.add(sc.nextLine());
        }

        for(int i = 0 ; i < M ; i++){
           String name = sc.nextLine();

           if(hs.contains(name)){
               list.add(name);
           }
        }

        Collections.sort(list);

        System.out.println(list.size());

        for(int i = 0 ; i < list.size();i++){
            System.out.println(list.get(i));
        }
        
        sc.close();
    }
}
