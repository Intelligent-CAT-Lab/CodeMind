import java.util.*;

public class atcoder_ABC164_D {
    static int k = 2019;
    static int[] tens = new int[1000001];
    static int[] mods0toi = new int[1000000];
    static int cur = 0;
    static Map<Integer, Integer> s = new HashMap<>();
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        for (int i = 0; i < s