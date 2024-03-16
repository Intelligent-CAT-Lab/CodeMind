Here is the translated Java code for the provided Python snippet:

```java
public class Main {
    public static void main(String[] args) {
        String input = "125"; // Test input
        System.out.println(dfs(0, new int[]{0}, input, 0)); // Expected output: 176
    }

    private static int dfs(int i, int[] sep, String s, int tot) {
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

        // When inserting '+' at the i-th position
        int[] newSep = new int[sep.length + 1];
        System.arraycopy(sep, 0, newSep, 0, sep.length);
        newSep[sep.length] = i;
        tot += dfs(i, newSep, s, 0);

        // When not inserting '+' at the i-th position
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}
```

Note that in Java, arrays are fixed-size, so I have created a new array with one additional space for appending an element to the equivalent of Python's list `append` and `pop` operations. Moreover, since Java arrays cannot grow dynamically, each recursive stack creates a new array to store the `sep` indices. Also, the `main` method contains a test case to run the program as you have mentioned. Input from the console is not read in this example for the sake of simplicity, and the input is directly provided as a string.
