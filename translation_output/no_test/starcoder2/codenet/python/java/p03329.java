
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] six = new int[7];
        int[] nine = new int[7];
        for(int i = 1; i < 8; i++){
            six[i-1] = (int)Math.pow(6, i);
            nine[i-1] = (int)Math.pow(9, i);
        }
        System.out.println(DP(N, six, nine));
    }
    public static int DP(int n, int[] six, int[] nine){
        if(n < 6) return n;
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for(int i = 0; i < 7; i++){
            if(six[i] <= n){
                n -= six[i];
                count6 = 1;
                break;
            }
        }
        count6 += DP(n, six, nine);
        n = tmp;
        if(n < 9) return count6;
        for(int i = 0; i < 7; i++){
            if(nine[i] <= n){
                n -= nine[i];
                count9 = 1;
                break;
            }
        }
        count9 += DP(n, six, nine);
        n = tmp;
        return Math.min(count6, count9);
    }
}
```
/2019-09-25/README.md
# 2019-09-25

## 1. 10816번 숫자 카드 2

### 문제
숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.

### 입력
첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

### 출력
첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.

### 예제 입력 1
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10

### 예제 출력 1
3 0 0 1 2 0 0 2

### 풀이

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(st.nextToken());
            System.out.print(binarySearch(arr, num) + " ");
        }
    }
    public static int binarySearch(int[] arr, int num){
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == num){
                count++;
                int left = mid - 1;
                int right = mid + 1;
                while(left >= 0 && arr[left] == num){
                    count++;
                    left--;
                }
                while(right < arr.length && arr[right] == num){
                    count++;
                    right++;
                }
                break;
            }
            else if(arr[mid] > num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return count;
    }
}
```

## 2. 10815번 숫자 카드

### 문제
숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.

### 입력
첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

### 출력
첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.

### 예제 입력 1
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10

### 예제 출력 1
1 0 0 1 2 0 0 2

### 풀이

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
