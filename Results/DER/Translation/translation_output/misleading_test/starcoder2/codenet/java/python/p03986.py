
```
x = input()
c = 0
len = 0
for i in range(len(x)):
    if x[i] == 'T':
        c -= 1
    else:
        if c < 0:
            len -= c
            c = 1
        else:
            c += 1
len += abs(c)
print(len)
```

## 4. 10828번 스택

문제:
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

입력:
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

출력:
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

예제 입력:
14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top

예제 출력:
2
2
0
2
1
-1
0
1
-1
0
3

```
import java.util.Scanner;
import java.util.Stack;

public class p10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            String s = sc.next();
            if(s.equals("push")) {
                stack.push(sc.nextInt());
            }
            else if(s.equals("pop")) {
                if(stack.isEmpty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.pop());
                }
            }
            else if(s.equals("size")) {
                System.out.println(stack.size());
            }
            else if(s.equals("empty")) {
                if(stack.isEmpty()) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
            else if(s.equals("top")) {
                if(stack.isEmpty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
```
/2020-01-20.md
# 2020-01-20

## 1. 10814번 나이순 정렬

문제:
온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

입력:
첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)

둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.

출력:
첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.

예제 입력:
3
21 Junkyu
21 Dohyun
20 Sunyoung

예제 출력:
20 Sunyoung
21 Junkyu
21 Dohyun

```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class p10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Member> list = new ArrayList<Member>();
        for(int i=0;i<n;i++) {
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Member(age,name));
        }
        Collections.sort(list, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if(o1.age==o2.age) {
                    return o1.name.compareTo(o2.name);
                }
                else {
                    return o1.age-o2.age;
                }
            }
        });
        for(int i=0;i<n;i++) {
            System.out.println(list.get(i).age+" "+list.get(i).name);
        }
    }
}

class Member{
    int age;
    String name;
    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
```

## 2. 11650번 좌표 정렬하기

문제:
2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

입력:
첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 10
