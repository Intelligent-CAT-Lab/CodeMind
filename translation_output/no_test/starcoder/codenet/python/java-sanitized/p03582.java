import java.util.*;
public class p03582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        L.add(0,0);
        L.add(0,1);
        L.add(0,2);
        while(L.size()>1){
            L.set(0,L.get(0)+L.get(L.size()-1));
            Collections.sort(L);
            L.remove(L.size()-1);
        }
        System.out.println(String.valueOf(L.get(0)));
    }
}