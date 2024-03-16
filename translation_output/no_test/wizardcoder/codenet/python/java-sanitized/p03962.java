import java.util.*;

public class p03962 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.asList(sc.nextLine().split("\\s")).stream().map(Integer::parseInt).collect(Collectors.toList());
        Set<Integer> uniqueNums = new HashSet<>(nums);
        System.out.println(uniqueNums.size());
    }
}