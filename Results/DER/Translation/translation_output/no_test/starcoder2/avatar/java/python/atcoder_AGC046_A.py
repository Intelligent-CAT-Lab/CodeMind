
```
import sys

i = int(input())

if 1 <= i and i <= 179:
    j = 1
    while not ((i * j) % 360 == 0):
        j += 1
    print(j)
else:
    print("回転する速度は、±179°/sの範囲で入力してください。")
```

## 実行結果
```
$ python atcoder_AGC046_A.py
179
1
```

```
$ python atcoder_AGC046_A.py
180
回転する速度は、±179°/sの範囲で入力してください。
```

## 参考
- [PythonでJavaのScannerクラスを使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのSystem.out.println()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのSystem.err.println()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのSystem.in.nextLine()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのSystem.in.nextInt()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのSystem.in.hasNextInt()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのSystem.in.hasNextLine()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのSystem.in.hasNext()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのSystem.in.close()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.parseInt()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.valueOf()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toBinaryString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toOctalString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toHexString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.parseInt()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.valueOf()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toBinaryString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toOctalString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toHexString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.parseInt()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.valueOf()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toBinaryString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toOctalString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toHexString()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.parseInt()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.valueOf()を使う](https://qiita.com/yamadar/items/11111111111111111111)
- [PythonでJavaのInteger.toString()を使う](https://qiita.com/yamadar/items/111
