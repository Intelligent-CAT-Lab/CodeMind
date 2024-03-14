<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;

public class p02582 {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String s = read.readLine();
        int res = 0;
        if (s.charAt(0) == 'R' && s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            res = 3;
        } else if (s.charAt(0) == 'R' && s.charAt(1) == 'R') {
            res = 2;
        } else if (s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            res = 2;
        } else if (s.charAt(0) == 'S' && s.charAt(1) == 'S' && s.charAt(2) == 'S') {
            res = 0;
        } else {
            res = 1;
        }

        prnt.println(res);
        prnt.close();
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import java.io.*;

public class p02582 {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String s = read.readLine();
        int res = 0;
        if (s.charAt(0) == 'R' && s.charAt(1) == 'R' && s.charAt(2) == 'R'):
            res = 3;
        elif (s.charAt(0) == 'R' && s.charAt(1) == 'R'):
            res = 2;
        elif (s.charAt(1) == 'R' && s.charAt(2) == 'R'):
            res = 2;
        elif (s.charAt(0) == 'S' && s.charAt(1) == 'S' && s.charAt(2) == 'S'):
            res = 0;
        else:
            res = 1;

        prnt.println(res);
        prnt.close();
    }
}
```
<|endoftext|>
