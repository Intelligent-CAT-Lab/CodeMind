
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (S.length() < 5) {
            System.out.println("NO");
            return;
        }
        int i = 0;
        while (true) {
            if ((i + 5 == S.length() && S.substring(i, i + 5).equals("dream")) || (i + 5 == S.length() && S.substring(i, i + 5).equals("erase")) || (i + 6 == S.length() && S.substring(i, i + 6).equals("eraser")) || (i + 7 == S.length() && S.substring(i, i + 7).equals("dreamer"))) {
                System.out.println("YES");
                return;
            } else if (S.substring(i, i + 5).equals("dream") && i + 8 <= S.length()) {
                if (S.substring(i + 5, i + 8).equals("erd") || S.substring(i + 5, i + 8).equals("ere")) i += 7;
                else if (S.substring(i + 5, i + 8).equals("era") || S.substring(i + 5, i + 6).equals("d")) i += 5;
                else {
                    System.out.println("NO");
                    return;
                }
            } else if (S.substring(i, i + 5).equals("erase") && i + 7 <= S.length()) {
                if (S.substring(i + 5, i + 6).equals("e") || S.substring(i + 5, i + 6).equals("d")) i += 5;
                else if (S.substring(i + 5, i + 6).equals("r")) i += 6;
                else {
                    System.out.println("NO");
                    return;
                }
            } else {
                System.out.println("NO");
                return;
            }
        }
    }
}
```
/2019-09-25/README.md
# 2019-09-25

## 1. 1000번 A+B

[문제 링크](https://www.acmicpc.net/problem/1000)

## 2. 1001번 A-B

[문제 링크](https://www.acmicpc.net/problem/1001)

## 3. 1002번 Turret

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

## 15. 10250번 ACM 호텔

[문제 링크](https://www.acmicpc.net/problem/10250)

## 16. 1026번 보물

[문제 링크](https://www.acmicpc.net/problem/1026)

## 17. 1032번 명령 프롬프트

[문제 링크](https://www.acmicpc.net/problem/1032)

## 18. 10430번 나머지

[문제 링크](https://www.acmicpc.net/problem/10430)

## 19. 1074번 Z

[문제 링크](https://www.acmicpc.net/problem/1074)

## 20. 10757번 큰 수 A+B

[문제 링크](https://www.acmicpc.net/problem/10757)

## 21. 10773번 제로

[문제 링크](https://www.acmicpc.net/problem/10773)

## 22. 10809번 알파벳 찾기

[문제 링크](https://www.acmicpc.net/problem/10809)

## 23. 10814번 나이순 정렬

[문제 링크](https://www.acmicpc.net/problem/10814)

## 24. 10815번 숫자 카드

[문제 링크](https://www.acmicpc.net/problem/10815)

## 25. 10816번 숫자 카드 2

[문제 링크](https://www.acmicpc.net/problem/10816)

## 26. 10817번 세 수

[문제 링크](https://www.acmicpc.net
