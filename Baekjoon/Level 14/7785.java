import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashSet<String> hs = new HashSet<String>();

        for(int i = 0 ; i < N ;i++){
            String name = sc.next();
            String status = sc.next();
                if (status.equals("enter")) {
                    hs.add(name);
                }else{ //leave
                    hs.remove(name);
                }
            }

        sc.close();

        ArrayList<String> list = new ArrayList<>(hs);
        Collections.sort(list, Comparator.reverseOrder()); //내림차순

        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
