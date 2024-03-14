import java.util.*;

public class p00018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.asList(sc.nextLine().split("\\s+"));
        Collections.sort(nums, Collections.reverseOrder());
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}