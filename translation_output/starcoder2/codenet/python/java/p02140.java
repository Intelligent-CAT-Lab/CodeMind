
```java

```

## 10. 参考

- [AtCoder Beginner Contest 157](https://atcoder.jp/contests/abc157)


## 10. 参考

- [AtCoder Beginner Contest 157](https://atcoder.jp/contests/abc157)

## 11. その他

- 解説を見てもわからなかったので、解説を見てもう一度解いた。
/ABC157/ABC157_C.md
# AtCoder Beginner Contest 157

## 1. 問題

https://atcoder.jp/contests/abc157/tasks/abc157_c

## 2. 考え方

- 1桁の数字を1つ選んで、その数字を1桁の数字にする。
- 2桁の数字を1つ選んで、その数字を2桁の数字にする。
- 3桁の数字を1つ選んで、その数字を3桁の数字にする。

## 3. 解答

```python
N, M = map(int, input().split())

ans = -1
for i in range(1000):
    if len(str(i)) != N:
        continue
    flag = True
    for j in range(M):
        s, c = map(int, input().split())
        if str(i)[s-1] != str(c):
            flag = False
            break
    if flag:
        ans = i
        break

print(ans)
```

## 4. 考察

- 1桁の数字を1つ選んで、その数字を1桁の数字にする。
- 2桁の数字を1つ選んで、その数字を2桁の数字にする。
- 3桁の数字を1つ選んで、その数字を3桁の数字にする。

## 5. 参考

- [AtCoder Beginner Contest 157](https://atcoder.jp/contests/abc157)

## 6. その他

- 解説を見てもわからなかったので、解説を見てもう一度解いた。

## 7. 問題

https://atcoder.jp/contests/abc157/tasks/abc157_c

## 8. 考え方

- 1桁の数字を1つ選んで、その数字を1桁の数字にする。
- 2桁の数字を1つ選んで、その数字を2桁の数字にする。
- 3桁の数字を1つ選んで、その数字を3桁の数字にする。

## 9. 解答

```python
N, M = map(int, input().split())

ans = -1
for i in range(1000):
    if len(str(i)) != N:
        continue
    flag = True
    for j in range(M):
        s, c = map(int, input().split())
        if str(i)[s-1] != str(c):
            flag = False
            break
    if flag:
        ans = i
        break

print(ans)
```

## 10. 考察

- 1桁の数字を1つ選んで、その数字を1桁の数字にする。
- 2桁の数字を1つ選んで、その数字を2桁の数字にする。
- 3桁の数字を1つ選んで、その数字を3桁の数字にする。/ABC157/ABC157_D.md
# AtCoder Beginner Contest 157

## 1. 問題

https://atcoder.jp/contests/abc157/tasks/abc157_d

## 2. 考え方

- 解説を見てもわからなかったので、解説を見てもう一度解いた。

## 3. 解答

```python

```

## 4. 考察

- 解説を見てもわからなかったので、解説を見てもう一度解いた。

## 5. 参考

- [AtCoder Beginner Contest 157](https://atcoder.jp/contests/abc157)

## 6. その他

- 解説を見てもわからなかったので、解説を見てもう一度解いた。

## 7. 問題

https://atcoder.jp/contests/abc157/tasks/abc157_d

## 8. 考え方

- 解説を見てもわからなかったので、解説を見てもう一度解いた。

## 9. 解答

```python

```

## 10. 考察

- 解説を見てもわからなかったので、解説を見てもう一度解いた。

## 11. 参考

- [AtCoder Beginner Contest 157](https://atcoder.jp/contests/abc157)

## 12. その他

- 解説を見てもわからなかったので、解説を見てもう一度解いた。
/ABC157/ABC157_A.md
# AtCoder Beginner Contest 157

## 1. 問題

https://atcoder.jp/contests/abc157/tasks/abc157_a

## 2. 考え方

- 解説を見てもわからなかったので、解説を見てもう一度解いた。

## 3. 解答

```python
N = int(input())

print((N+1)//2)
```

## 4. 考察

- 解説を見てもわからなかったので、解説を見てもう一度解いた。

## 5. 参考

- [AtCoder Beginner Contest 157](https://atcoder.jp/contests/abc157)

## 6. その他

- 解説を見てもわから
