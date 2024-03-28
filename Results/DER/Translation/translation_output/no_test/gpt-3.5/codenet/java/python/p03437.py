```python
'''
String[]の初期化、整数の型がlongになっているか
関数（splitやcontainsなど）内では"+"などは正規表現として表現されるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はいのいの初期化した？？？？？？？
割り算の割り算は絶対値が小さい時に切り捨てられるex.-1/2=0ので、ある値>kなら式とするとバグるわける
ある値>=kとして、切り上げられた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
'''
#入力終了→Ctrl+D
import math

def main():
    x, y = map(int, input().split())
    if x % y == 0:
        print(-1)
    else:
        print(x)

if __name__ == "__main__":
    main()
```
