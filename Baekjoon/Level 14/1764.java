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

/*
     HashSet이란?
    -set인터페이스에서 지원하는 구현클래스로 중복을 허용하지않고 순서 상관없이 저장된다.
     contains() 메서드를 사용하면 값이 있으면 true, 없으면 false 를 반환한다.
    
    Collection.sort(): 리스트에 저장된 값을 오름차순으로 정리해준다.
/*
