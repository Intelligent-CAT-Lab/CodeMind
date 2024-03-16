
```

```

## 2.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC051_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        
        int count = 0;
        for (int x = 0; x <= k; x++) {
            for (int y = 0; y <= k; y++) {
                int z = s - x - y;
                if (z >= 0 && z <= k) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
```

python code:
```

```

## 3.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC051_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();
        
        int dx = tx - sx;
        int dy = ty - sy;
        
        for (int i = 0; i < dy; i++) {
            System.out.print("U");
        }
        for (int i = 0; i < dx; i++) {
            System.out.print("R");
        }
        for (int i = 0; i < dy; i++) {
            System.out.print("D");
        }
        for (int i = 0; i < dx; i++) {
            System.out.print("L");
        }
        System.out.print("L");
        for (int i = 0; i < dy + 1; i++) {
            System.out.print("U");
        }
        for (int i = 0; i < dx + 1; i++) {
            System.out.print("R");
        }
        System.out.print("DR");
        for (int i = 0; i < dy + 1; i++) {
            System.out.print("D");
        }
        for (int i = 0; i < dx + 1; i++) {
            System.out.print("L");
        }
        System.out.print("U");
    }
}
```

python code:
```

```

## 4.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC051_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = 1000000000;
            }
        }
        
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int c = scanner.nextInt();
            d[a][b] = c;
            d[b][a] = c;
        }
        
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int c = scanner.nextInt();
            if (d[a][b] < c) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
```

python code:
```

```

## 5.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC051_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = 1000000000;
            }
        }
        
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int c = scanner.nextInt();
            d[a][b] = c;
            d[b][a] = c;
        }
        
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (d[i][j] == 1000000000) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
```

python code:
```

```

## 6.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC051_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = 1000000000;
            }
        }
        
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int c = scanner.nextInt();
            d[a][b] = c;
            d[b][a] = c;
        }
        
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (d[i][j] == 1000000000) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
```

python code:
```

```

## 7.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC051_G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0;
