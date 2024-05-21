import java.util.*;

public class p02393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String num : input) {
            nums.add(Integer.parseInt(num));
        }
        Collections.sort(nums);
        System.out.println(nums.get(0) + " " + nums.get(1) + " " + nums.get(2));
    }
}