import java.util.*;

public class p02149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> S = new ArrayList<>();
        for(String s : sc.nextLine().split(" ")) {
            S.add(Integer.parseInt(s));
        }
        int maxIndex = S.indexOf(Collections.max(S));
        switch(maxIndex) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}