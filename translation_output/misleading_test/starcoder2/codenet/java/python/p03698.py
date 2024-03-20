
```python
import sys

input_str = sys.stdin.readline().strip()

if len(input_str) == len(set(input_str)):
    print("yes")
else:
    print("no")
```

## 03699

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class p03699 {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(""));
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < inputString.size(); i++) {
                if (i % 2 == 0) {
                    ans.add(inputString.get(i));
                }
            }

            System.out.println(String.join("", ans));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
```

python code:
```python
import sys

input_str = sys.stdin.readline().strip()

print(input_str[::2])
```

## 03700

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
13579

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class p03700 {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(""));
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < inputString.size(); i++) {
                if (i % 2 == 1) {
                    ans.add(inputString.get(i));
                }
            }

            System.out.println(String.join("", ans));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
```

python code:
```python
import sys

input_str = sys.stdin.readline().strip()

print(input_str[1::2])
```

## 03701

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
2468

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class p03701 {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(""));
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < inputString.size(); i++) {
                if (i % 2 == 0) {
                    ans.add(inputString.get(i));
                }
            }

            System.out.println(String.join("", ans));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
```

python code:
```python
import sys

input_str = sys.stdin.readline().strip()

print(input_str[::2])
```

## 03702

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
13579

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class p03702 {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(""));
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < inputString.size(); i++) {
                if (i % 2 == 1) {
                    ans.add(inputString.get(i));
                }
            }

            System.out.println(String.join("", ans));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
```

python code:
```python
import sys

input_str = sys.stdin.readline().strip()

print(input_str[1::2])
```

## 03703

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class p03703 {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(""));
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < inputString.size(); i++) {
                if (i % 2 == 0) {
                    ans.add(inputString.get(i));
                }
            }

            System.out.println(String.join("", ans));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
```

python code:
```python
import sys

input_str = sys.stdin.readline().strip()

print(input_str[::2])
```
