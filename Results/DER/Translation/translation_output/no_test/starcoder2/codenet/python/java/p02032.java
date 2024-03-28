
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> d = prime_factorization_2(n);
        int val = 1;
        for (int v : d.values()) {
            val *= (v + 1);
        }
        System.out.println(d.size() + " " + (val - 1));
    }

    static HashMap<Integer, Integer> prime_factorization_2(int num) {
        HashMap<Integer, Integer> dict_counter = new HashMap<>();
        if (num <= 1) {
            return dict_counter;
        }
        int num_sqrt = (int) Math.floor(Math.sqrt(num));
        ArrayList<Integer> prime_list = make_prime_list_2(num_sqrt);
        for (int prime : prime_list) {
            while (num % prime == 0) {
                if (dict_counter.containsKey(prime)) {
                    dict_counter.put(prime, dict_counter.get(prime) + 1);
                } else {
                    dict_counter.put(prime, 1);
                }
                num /= prime;
            }
        }
        if (num != 1) {
            if (dict_counter.containsKey(num)) {
                dict_counter.put(num, dict_counter.get(num) + 1);
            } else {
                dict_counter.put(num, 1);
            }
        }
        return dict_counter;
    }

    static ArrayList<Integer> make_prime_list_2(int num) {
        ArrayList<Integer> prime_list = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            prime_list.add(i);
        }
        prime_list.set(1, 0);
        double num_sqrt = Math.sqrt(num);
        for (int prime : prime_list) {
            if (prime == 0) {
                continue;
            }
            if (prime > num_sqrt) {
                break;
            }
            for (int non_prime = 2 * prime; non_prime <= num; non_prime += prime) {
                prime_list.set(non_prime, 0);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int prime : prime_list) {
            if (prime != 0) {
                ans.add(prime);
            }
        }
        return ans;
    }
}
```

## 10. 素数判定

素数判定を実装してください。

### 入力

```
1000000007
```

### 出力

```
True
```

### 入力

```
1000000009
```

### 出力

```
True
```

### 入力

```
1000000019
```

### 出力

```
True
```

### 入力

```
1000000021
```

### 出力

```
False
```

### 入力

```
1000000033
```

### 出力

```
True
```

### 入力

```
1000000087
```

### 出力

```
True
```

### 入力

```
1000000093
```

### 出力

```
True
```

### 入力

```
1000000097
```

### 出力

```
True
```

### 入力

```
1000000099
```

### 出力

```
False
```

### 入力

```
1000000103
```

### 出力

```
True
```

### 入力

```
1000000121
```

### 出力

```
True
```

### 入力

```
10
