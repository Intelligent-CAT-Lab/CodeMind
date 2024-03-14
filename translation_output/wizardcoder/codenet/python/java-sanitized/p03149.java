import java.util.*;
public class p03149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for(String s : sc.nextLine().split(" ")) {
            a.add(Integer.parseInt(s));
        }
        Collections.sort(a);
        List<Integer> b = Arrays.asList(1,4,7,9);
        if(a.equals(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}