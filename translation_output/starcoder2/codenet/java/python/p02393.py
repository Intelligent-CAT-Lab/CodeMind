
```
import sys

strNum = sys.stdin.readline()
strNumList = strNum.split(" ")

strNumList.sort()

print(strNumList[0] + " " + strNumList[1] + " " + strNumList[2])
```

## 2. 10817번

### 문제
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

### 입력
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

### 출력
두 번째로 큰 정수를 출력한다.

### 예제 입력 1 
```
20 30 10
```

### 예제 출력 1 
```
20
```

### 예제 입력 2 
```
30 30 10
```

### 예제 출력 2 
```
30
```

### 예제 입력 3 
```
40 40 40
```

### 예제 출력 3 
```
40
```

### 예제 입력 4 
```
20 10 10
```

### 예제 출력 4 
```
10
```

### 풀이

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p010817 {

    public static void main(String[] args) throws IOException{
        
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String strNum = br.readLine();
        String[] strNumList = strNum.split(" ");
        
        Arrays.sort(strNumList);
        
        System.out.println(strNumList[1]);
    }
}
```

python code:
```
import sys

strNum = sys.stdin.readline()
strNumList = strNum.split(" ")

strNumList.sort()

print(strNumList[1])
```

## 3. 2523번

### 문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

### 입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

### 출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

### 예제 입력 1 
```
3
```

### 예제 출력 1 
```
*
**
***
**
*
```

### 예제 입력 2 
```
4
```

### 예제 출력 2 
```
*
**
***
****
***
**
*
```

### 예제 입력 3 
```
5
```

### 예제 출력 3 
```
*
**
***
****
*****
****
***
**
*
```

### 풀이

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02523 {

    public static void main(String[] args) throws IOException{
        
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int intNum = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= intNum; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = intNum - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

python code:
```
import sys

intNum = int(sys.stdin.readline())

for i in range(1, intNum + 1):
    for j in range(1, i + 1):
        print("*", end="")
    print()

for i in range(intNum - 1, 0, -1):
    for j in range(1, i + 1):
        print("*", end="")
    print()
```

## 4. 10871번

### 문제
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

### 입력
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

### 출력
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

### 예제 입력 1 
```
10 5
1 10 4 9 2 3 8 5 7 6
```

### 예제 출력 1 
```
1 4 2 3
```

### 풀이

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p010871 {

    public static void main(String[] args) throws IOException{
        
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int intNum = Integer.parseInt(st.nextToken());
        int intX = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < intNum; i++) {
            int intNumList = Integer.parseInt(st.nextToken());
            if(intNumList < intX) {
                System.out.print(intNumList + " ");
            }
        }
    }
}
```

python code:
```
import sys

intNum, intX = map(int, sys.stdin.readline().split())

intNumList = list(map(int, sys.stdin.readline().split()))

for i in intNumList:
    if i < intX:
        print(i, end=" ")
```

## 5. 11021번

### 문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄
