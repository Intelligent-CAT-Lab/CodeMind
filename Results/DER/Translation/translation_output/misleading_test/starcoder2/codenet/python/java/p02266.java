
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        int[] g = new int[s.length() + 1];
        boolean[] b = new boolean[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '_') {
                cnt += 0;
            } else if (c == '/') {
                cnt += 1;
            } else if (c == '\\') {
                cnt -= 1;
            }
            g[i + 1] = cnt;
        }
        int gmax = g[0];
        for (int i = 1; i < g.length; i++) {
            if (g[i - 1] < g[i] && g[i] <= gmax) {
                b[i] = true;
            }
            gmax = Math.max(gmax, g[i]);
        }
        int[] puddles = new int[s.length()];
        int volume = 0;
        int saface_level = -1;
        int index = 0;
        for (int i = g.length - 1; i >= 0; i--) {
            if (saface_level != -1) {
                volume += saface_level - g[i];
                if (saface_level == g[i]) {
                    puddles[index] = volume;
                    index++;
                    saface_level = -1;
                    volume = 0;
                }
            }
            if (saface_level == -1 && b[i]) {
                saface_level = g[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += puddles[i];
        }
        System.out.println(sum);
        System.out.println(index);
        for (int i = 0; i < index; i++) {
            System.out.print(puddles[i] + " ");
        }
    }
}
```
/2019-09-16/README.md
# 2019-09-16

## 1. 1000번 A+B

[문제 링크](https://www.acmicpc.net/problem/1000)

## 2. 1001번 A-B

[문제 링크](https://www.acmicpc.net/problem/1001)

## 3. 1002번 터렛

[문제 링크](https://www.acmicpc.net/problem/1002)

## 4. 1003번 피보나치 함수

[문제 링크](https://www.acmicpc.net/problem/1003)

## 5. 1004번 어린 왕자

[문제 링크](https://www.acmicpc.net/problem/1004)

## 6. 1005번 ACM Craft

[문제 링크](https://www.acmicpc.net/problem/1005)

## 7. 1008번 A/B

[문제 링크](https://www.acmicpc.net/problem/1008)

## 8. 1010번 다리 놓기

[문제 링크](https://www.acmicpc.net/problem/1010)

## 9. 1011번 Fly me to the Alpha Centauri

[문제 링크](https://www.acmicpc.net/problem/1011)

## 10. 1012번 유기농 배추

[문제 링크](https://www.acmicpc.net/problem/1012)

## 11. 1016번 제곱 ㄴㄴ 수

[문제 링크](https://www.acmicpc.net/problem/1016)

## 12. 1017번 소수 쌍

[문제 링크](https://www.acmicpc.net/problem/1017)

## 13. 1018번 체스판 다시 칠하기

[문제 링크](https://www.acmicpc.net/problem/1018)

## 14. 1021번 회전하는 큐

[문제 링크](https://www.acmicpc.net/problem/1021)

## 15. 1025번 제곱수 찾기

[문제 링크](https://www.acmicpc.net/problem/1025)

## 16. 1026번 보물

[문제 링크](https://www.acmicpc.net/problem/1026)

## 17. 1032번 명령 프롬프트

[문제 링크](https://www.acmicpc.net/problem/1032)

## 18. 1037번 약수

[문제 링크](https://www.acmicpc.net/problem/1037)

## 19. 10430번 나머지

[문제 링크](https://www.acmicpc.net/problem/10430)

## 20. 10451번 순열 사이클

[문제 링크](https://www.acmicpc.net/problem/10451)

## 21. 1057번 토너먼트

[문제 링크](https://www.acmicpc.net/problem/1057)

## 22. 1065번 한수

[문제 링크](https://www.acmicpc.net/problem/1065)

## 23. 1074번 Z

[문제 링크](https://www.acmicpc.net/problem/1074)

## 24. 1075번 나누기

[문제 링크](https://www.acmicpc.net/problem/1075)

## 25. 10773번 제로

[문제 링크](https://www.acmicpc.net/problem/10773)

## 26. 10809번 알파벳 찾기

[문제 링크](https://www.acmicpc.net/problem/10809)

## 27. 10814
