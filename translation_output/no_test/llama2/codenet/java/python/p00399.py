<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.InputStreamReader;

//PCK/Prelim:   0404:   Shiba Inu
// http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
class p00399 {

	public static void main(String[] args) throws Exception {
		int result = 0;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String[] numDog = reader.readLine().split(" ");

			for(int i=0;i<numDog.length;i++) {
				result += Integer.parseInt(numDog[i]);
			}

			System.out.println(result);

		}
	}

}

```

### 解答

```python
import sys

result = 0

for line in sys.stdin:
    numDog = line.split()
    for num in numDog:
        result += int(num)

print(result)
```

### 解説

```python
import sys
```

`sys`モジュールは、システムの情報を取得するために使用する。

```python
for line in sys.stdin:
    numDog = line.split()
    for num in numDog:
        result += int(num)
```

`sys.stdin`は、標準入力ストリームを表す。

`line`は、標準入力ストリームから1行読み込んだ文字列です。

`numDog`は、`line`から`split()`した文字列の配列です。

`num`は、`numDog`の各要素を`int`に変換したものです。

`result`は、`num`を`+=`しています。

`print(result)`は、`result`を出力します。

### 参考

- [Python 3.9.1 - 標準入力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリーム](https://docs.python.jp/3/library/stdtypes.html#file-objects)
- [Python 3.9.1 - 標準入力ストリームと標準出力ストリ
