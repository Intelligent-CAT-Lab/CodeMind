

```python
k, s = map(int, input().split())
count = 0
for x in range(k+1):
    for y in range(k+1):
        z = s - x - y
        if z >= 0 and z <= k:
            count += 1
print(count)
```

## 3.8.3. 1000000007

The following code is a solution to the problem 1000000007.

```
import java.util.*;

public class p1000000007{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        // search
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
        }

        // answer
        System.out.println(count);

    }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
count = 0
for i in range(n):
    for j in range(i+1, n):
        if a[i] == a[j]:
            count += 1
print(count)
```

## 3.8.4. 1000000008

The following code is a solution to the problem 1000000008.

```
import java.util.*;

public class p1000000008{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        // search
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(a[i] == a[j] + a[k]){
                        count++;
                    }
                }
            }
        }

        // answer
        System.out.println(count);

    }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
count = 0
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            if a[i] == a[j] + a[k]:
                count += 1
print(count)
```

## 3.8.5. 1000000009

The following code is a solution to the problem 1000000009.

```
import java.util.*;

public class p1000000009{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        // search
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    for(int l = k + 1; l < n; l++){
                        if(a[i] + a[j] + a[k] == a[l]){
                            count++;
                        }
                    }
                }
            }
        }

        // answer
        System.out.println(count);

    }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
count = 0
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            for l in range(k+1, n):
                if a[i] + a[j] + a[k] == a[l]:
                    count += 1
print(count)
```

## 3.8.6. 1000000010

The following code is a solution to the problem 1000000010.

```
import java.util.*;

public class p1000000010{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        // search
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    for(int l = k + 1; l < n; l++){
                        for(int m = l + 1; m < n; m++){
                            if(a[i] + a[j] + a[k] + a[l] == a[m]){
                                count++;
                            }
                        }
                    }
                }
            }
        }

        // answer
        System.out.println(count);

    }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
count = 0
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            for l in range(k+1, n):
                for m in range(l+1, n):
                    if a[i] + a[j] + a[k] + a[l] == a[m]:
                        count += 1
print(count)
```

## 3.8.7. 1000000011

The following code is a solution to the problem 1000000011.

```
import java.util.*;

public class p1000000011{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        // search
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    for(int l = k + 1; l < n; l++){
                        for(int m = l + 1; m < n; m++){
                            for(int o = m + 1; o < n; o++){
                                if(a[i] + a[j] + a[k] + a[l] + a[m] == a[o]){
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }

        // answer
        System.out.println(count);

    }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))
count
