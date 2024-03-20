

```java

```
/src/main/java/com/hackerrank/algorithms/implementation/SockMerchant.java
package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

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

public class CountingValleys {

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

public class MigratoryBirds {

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

public class DrawingBook {

    public static int pageCount(int n, int p) {
        // Write your code here
        int front = p / 2;
        int back = n / 2 - front;
        return Math.min(front, back);
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/BonAppetit.java
package com.hackerrank.algorithms.implementation;

public class BonAppetit {

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
/src/main/java/com/hackerrank/algorithms/implementation/BeautifulDaysAtTheMovies.java
package com.hackerrank.algorithms.implementation;

public class BeautifulDaysAtTheMovies {

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;
        for (int x = i; x <= j; x++) {
            int reverse = 0;
            int temp = x;
            while (temp > 0) {
                reverse = reverse * 10 + temp % 10;
                temp /= 10;
            }
            if ((x - reverse) % k == 0) count++;
      /src/main/java/com/hackerrank/algorithms/implementation/Kangaroo.java
package com.hackerrank.algorithms.implementation;

public class Kangaroo {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if (x1 < x2 && v1 <= v2) {
            return "NO";
        }
        if (x1 > x2 && v1 >= v2) {
            return "NO";
        }
        while (x1 != x2) {
            x1 += v1;
            x2 += v2;
        }
        return "YES";
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/AppleAndOrange.java
package com.hackerrank.algorithms.implementation;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Write your code here
        int appleCount = 0;
        int orangeCount = 0;
        for (int i = 0; i < apples.length; i++) {
            int apple = a + apples[i];
            if (apple >= s && apple <= t) {
                appleCount++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            int orange = b + oranges[i];
            if (orange >= s && orange <= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/GradingStudents.java
package com.hackerrank.algorithms.implementation;

public class GradingStudents {

    public static int[] gradingStudents(int[] grades) {
        // Write your code here
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                int nextMultiple = (grades[i] / 5 + 1) * 5;
                if (nextMultiple - grades[i] < 3) {
                    grades[i] = nextMultiple;
                }
            }
        }
        return grades;
    }
}
/src/main/java/com/hackerrank/algorithms/implementation/BetweenTwoSets.java
package com.hackerrank.algorithms.implementation;

public class BetweenTwo 0; i < b.length; i++) {
            if (b[i] % gcd != 0) {
                return 0;
            }
        }
        int count = 0;
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
            }
        }
        return count;
    }
}
Sets {

    public static int getTotalX(int[] a, int[] b) {
        // Write your code here
        int gcd = a[0];
        for (int i = 1; i < a
