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

/*
     HashSet이란?
    -set인터페이스에서 지원하는 구현클래스로 중복을 허용하지않고 순서 상관없이 저장된다.
     add는 Hahset에 추가(중복이면 추가안됨) remove는 삭제한다.
    
    Collection.sort(): 리스트에 저장된 값을 오름차순으로 정리해준다.
    Collections.sort(list, Comparator.reverseOrder()): 리스트에 저장된 값을 내림차순으로 정리해준다.
/*
