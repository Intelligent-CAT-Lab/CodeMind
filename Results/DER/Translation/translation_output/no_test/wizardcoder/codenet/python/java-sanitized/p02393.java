import java.util.*;
public class p02393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> s = new ArrayList<Integer>();
        s = Arrays.asList(sc.nextLine().split("\\s+")).stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> s1 = new ArrayList<Integer>(s);
        Collections.sort(s1);
        System.out.println(s