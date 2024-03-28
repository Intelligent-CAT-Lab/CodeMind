Here is the translated Java code:

```java
public class Main {
    public static void main(String[] args) {
        String s = "125";
        System.out.println(dfs(0, new int[]{0}, s, 0));
    }

    public static int dfs(int i, int[] sep, String s, int tot) {
        int n = s.length();
        i += 1;

        // When reached the deepest part
        if (i == n) {
            int ans = 0;
            if (sep.length > 1) {
                for (int j = 0; j < sep.length - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep[j], sep[j + 1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length - 1]));
            return ans;
        }

        // When inserting '+' at the ith position
        int[] newSepWithPlus = new int[sep.length + 1];
        System.arraycopy(sep, 0, newSepWithPlus, 0, sep.length);
        newSepWithPlus[sep.length] = i;
        tot += dfs(i, newSepWithPlus, s, 0);

        // When not inserting '+' at the ith position
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}
```

Please note that in Java, we do not have the same dynamic array capabilities as in Python, so we need to handle array resizing (to simulate the `append` and `pop` behavior in Python) using `System.arraycopy` and creating new arrays. This is less efficient than in Python but it's the best way to directly translate the provided Python code into Java without changing the algorithm's structure. If efficiency is a concern, consider using an ArrayList instead.
