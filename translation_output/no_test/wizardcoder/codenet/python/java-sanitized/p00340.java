import java.util.*;
public class p00340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();
        num = Arrays.asList(Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray());
        Collections.sort(num);
        if(num.get(0) == num.get(1) && num.get(2) == num.get(3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}