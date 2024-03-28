import java.util.*;

public class p01783 {
    static Map<String, Integer> fm = new HashMap<>();
    
    static int[] dd = new int[]{-1, 0, 1, 0};
    static int[] ddn = new int[]{-1, 0, -1, 1, 0, 1, 1, 1, 1, 0, 1, -1, 0, -1, -1, -1};

    static void setRecursionLimit(int limit) {
        // Set recursion limit here
    }

    static final long inf = 1000000000000000000L;
    static final double eps =