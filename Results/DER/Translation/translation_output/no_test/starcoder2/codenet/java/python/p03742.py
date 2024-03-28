
```python
import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())
    print("Brown" if abs(X-Y) <= 1 else "Alice")

if __name__ == "__main__":
    main()
```

## 解説

- 最終的にXとYの差が1以下になるように操作する
- 差が2以上の場合は、差が1以下になるように操作できる
- 差が1の場合は、差が0になるように操作できる
- 差が0の場合は、操作できない
- 差が1の場合は、Aliceが勝つ
- 差が0の場合は、Brownが勝つ

## 参考

- [Pythonで競技プログラミングの入力をスッキリ記述する](https://qiita.com/takayg1/items/33d574e01b346480901e)
- [Pythonで競技プログラミングを始めるときに知っておきたいこと](https://qiita.com/takayg1/items/33d574e01b346480901e)
- [Pythonで競技プログラミングを始めるときに知っておきたいこと](https://qiita.com/takayg1/items/33d574e01b346480901e)
- [Pythonで競技プログラミング
