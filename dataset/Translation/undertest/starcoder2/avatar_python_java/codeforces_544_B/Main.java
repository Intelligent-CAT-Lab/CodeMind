/src/main/java/com/hackerrank/algorithms/implementation/SockMerchant.java
package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;

public class codeforces_544_B {

    pub  Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = ar[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int pair = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pair += entry.getValue() / 2;
        }
        return pair;
    }
}
lic static int sockMerchant(int n, int[] ar) {
        // Write your code here
        // n = 9, ar = 10
      /src/main/java/com/hackerrank/algorithms/implementation/CountingValleys.java
package com.hackerrank.algorithms.implementation;

public class codeforces_544_B {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valley = 0;
        int level = 0;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                level++;
            } else {
                level--;
            }
            if (level == 0 && path.charAt(i) == 'U') {
                valley++;
            }
        }
        return valley;
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/MigratoryBirds.java
package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;

public class codeforces_544_B {

    public static int migratoryBirds(int[] arr) {
        // Write your code here
        Map<Integer, Integer  }
        int max = 0;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
      /src/main/java/com/hackerrank/algorithms/implementation/DrawingBook.java
package com.hackerrank.algorithms.implementation;

public class codeforces_544_B {

    public static int pageCount(int n, int p) {
        // Write your code here
        int front = p / 2;
        int back = n / 2 - front;
        return Math.min(front, back);
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/BonAppetit.java
package com.hackerrank.algorithms.implementation;

public class codeforces_544_B {

    public static void bonAppetit(int[] bill, int k, int b) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < bill.length; i++) {
            if (i != k) {
                sum += bill[i];
            }
        }
        int actual = sum / 2;
        if (actual == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actual);
        }
    }
}
  }
        return count;
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/BeautifulDaysAt