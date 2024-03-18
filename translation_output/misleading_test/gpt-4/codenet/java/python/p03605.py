Here is the equivalent Python code for the provided Java code:

```python
def main():
    N = int(input())

    amari = N % 10
    sho = N // 10

    if amari == 9:
        print("Yes")
    elif sho == 9:
        print("Yes")
    else:
        print("No")

# ***********************以下共通関数************************************************

def my_reverse(pStr):
    """
    文字列を反転して返す
    :param pStr: 文字列
    :return: 反転した文字列
    """
    if len(pStr) < 1:
        return ""
    
    return pStr[::-1]

def my_mod(a, b):
    """
    余りを求める。
    :param a:
    :param b:
    :return: 余り。余りがマイナスの時はプラスで返す。
    """
    ret = a % b

    if ret < 0:
        ret += b

    return ret

def my_pow_with_mod(kisu, josu, primeNumMod_0):
    """
    乗数を求める ※mod対応
    :param kisu: 基数
    :param josu: 乗数
    :param primeNumMod_0: 法 mod値 使わない場合は「0」
    :return:
    """
    ans = 1

    # 乗数が0の場合→1
    if josu == 0:
        return 1

    if primeNumMod_0 == 0:
        # modを使わないとき

        while josu > 0:

            if josu % 2 == 0:
                # 累乗が偶数の時

                kisu *= kisu
                josu = josu // 2
            else:
                # 累乗が奇数の時
                ans *= kisu
                josu -= 1

        return ans

    else:
        # modを使うとき

        # 始めに橋を落とす
        kisu = my_mod(kisu, primeNumMod_0)

        while josu > 0:

            if josu % 2 == 0:
                # 累乗が偶数の時

                kisu *= my_mod(kisu, primeNumMod_0)
                josu = josu // 2

            else:
                # 累乗が奇数の時
                ans *= my_mod(kisu, primeNumMod_0)
                josu -= 1

        return my_mod(ans, primeNumMod_0)

if __name__ == '__main__':
    main()
```

The above Python code is an equivalent translation of the Java code. It contains the same functionality in the methods `main`, `my_reverse`, `my_mod`, and `my_pow_with_mod`. Note that Python uses `//` for integer division and `%` for modulo operation, just like Java. Moreover, Python has native support for string reversal using slicing, so the `my_reverse` function implementation is simplified. The `if __name__ == '__main__':` line is the Python equivalent to Java's `public static void main(String[] args)` method.
