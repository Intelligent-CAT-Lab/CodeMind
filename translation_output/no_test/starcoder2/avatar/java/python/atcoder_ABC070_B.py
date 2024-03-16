
```
a, b, c, d = map(int, input().split())

array = [0] * 101

for i in range(a, b):
    array[i] += 1

for i in range(c, d):
    array[i] += 1

ans = 0
for i in range(101):
    if array[i] == 2:
        ans += 1

print(ans)
```

## 2. 
```
import java.util.*;

public class atcoder_ABC070_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        
        long ans = array[0];
        for (int i = 1; i < n; i++) {
            ans = lcm(ans, array[i]);
        }
        
        System.out.println(ans);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
```

python code:
```
n = int(input())
array = list(map(int, input().split()))

ans = array[0]
for i in range(1, n):
    ans = ans * array[i] // gcd(ans, array[i])

print(ans)
```

## 3. 
```
import java.util.*;

public class atcoder_ABC070_D {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            array[a][b] = c;
            array[b][a] = c;
        }
        
        int q = sc.nextInt();
        int[][] query = new int[q][2];
        for (int i = 0; i < q; i++) {
            query[i][0] = sc.nextInt() - 1;
            query[i][1] = sc.nextInt() - 1;
        }
        
        int[] ans = new int[q];
        int k = sc.nextInt() - 1;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(k);
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int i = 0; i < n; i++) {
                if (array[v][i] != 0 && dist[i] == Integer.MAX_VALUE) {
                    dist[i] = dist[v] + array[v][i];
                    queue.add(i);
                }
            }
        }
        
        for (int i = 0; i < q; i++) {
            ans[i] = dist[query[i][0]] + dist[query[i][1]];
        }
        
        for (int i = 0; i < q; i++) {
            System.out.println(ans[i]);
        }
    }
}
```

python code:
```
n = int(input())
array = [[0] * n for _ in range(n)]
for _ in range(n - 1):
    a, b, c = map(int, input().split())
    a -= 1
    b -= 1
    array[a][b] = c
    array[b][a] = c

q = int(input())
query = [list(map(int, input().split())) for _ in range(q)]
for i in range(q):
    query[i][0] -= 1
    query[i][1] -= 1

k = int(input())
k -= 1

dist = [float('inf')] * n
dist[k] = 0
queue = [k]
while queue:
    v = queue.pop(0)
    for i in range(n):
        if array[v][i] != 0 and dist[i] == float('inf'):
            dist[i] = dist[v] + array[v][i]
            queue.append(i)

ans = [0] * q
for i in range(q):
    ans[i] = dist[query[i][0]] + dist[query[i][1]]

for i in range(q):
    print(ans[i])
```

## 4. 
```
import java.util.*;

public class atcoder_ABC070_E {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[m][3];
        for (int i = 0; i < m; i++) {
            array[i][0] = sc.nextInt() - 1;
            array[i][1] = sc.nextInt() - 1;
            array[i][2] = sc.nextInt();
        }
        
        int q = sc.nextInt();
        int[][] query = new int[q][2];
        for (int i = 0; i < q; i++) {
            query[i][0] = sc.nextInt() - 1;
            query[i][1] = sc.nextInt() - 1;
        }
        
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int a = query[i][0];
            int b = query[i][1];
            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[a] = 0;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(a);
            while (!queue.isEmpty()) {
                int v = queue.poll();
                for (int j = 0; j < m; j++) {
                    if (array[j][0] == v && dist[array[j][1]] == Integer.MAX_VALUE) {
                        dist[array[j][1]] = dist[v] + array[j][2];
                        queue.add(array[j][1]);
                    }
                    if (array[j][1] == v && dist[array[j][0]] == Integer.MAX_VALUE) {
                        dist[array[j][0]] = dist[v] + array[j][2];
                        queue.add(array[j][0]);
                    }
                }
            }
            
            ans[i] = dist[b];
        }
        
        for (int i = 0; i < q; i++) {
            System.out.println(ans[i]);
        }
    }
}
```

python code:
```
n, m = map(int, input().split())
array = [list(map(int, input().split())) for _ in range(m)]
for i in range(m):
    array[i][0] -= 1
    array[i][1] -= 1

q = int(input())
query = [list(map(int, input().split())) for _ in range(q)]
for i in range(q):
    query[i][0] -= 1
    query[i][1] -= 1

ans = [0] * q
for i in range(q):
    a = query[i][0]
    b = query[i][1]
   
