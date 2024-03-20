

```java

```
/content/posts/2020-04-26-python-numpy-memo.md
---
title: "Python Numpy Memo"
date: 2020-04-26T15:00:00+09:00
draft: false
---

# Numpy

## 配列の生成

```python
import numpy as np

# 1次元配列
a = np.array([1, 2, 3])

# 2次元配列
b = np.array([[1, 2, 3], [4, 5, 6]])

# 0で初期化
c = np.zeros((2, 3))

# 1で初期化
d = np.ones((2, 3))

# 単位行列
e = np.eye(3)

# 乱数
f = np.random.rand(2, 3)
```

## 配列の操作

```python
import numpy as np

a = np.array([[1, 2, 3], [4, 5, 6]])

# 要素数
print(a.size)

# 形状
print(a.shape)

# 転置
print(a.T)

# 要素の型
print(a.dtype)

# 要素のサイズ
print(a.itemsize)

# 配列のサイズ
print(a.nbytes)

# 要素の取得
print(a[0, 0])

# スライス
print(a[0, :])
print(a[:, 0])

# 要素の変更
a[0, 0] = 10
print(a)

# 要素の追加
a = np.array([[1, 2, 3], [4, 5, 6]])
b = np.array([[7, 8, 9], [10, 11, 12]])
print(np.vstack((a, b)))
print(np.hstack((a, b)))

# 要素の削除
a = np.array([[1, 2, 3], [4, 5, 6]])
print(np.delete(a, 0, 0))
print(np.delete(a, 0, 1))

# 要素の結合
a = np.array([1, 2, 3])
b = np.array([4, 5, 6])
print(np.concatenate((a, b)))

# 要素の分割
a = np.array([[1, 2, 3], [4, 5, 6]])
print(np.split(a, 2, 0))
print(np.split(a, 3, 1))

# 要素のコピー
a = np.array([[1, 2, 3], [4, 5, 6]])
b = a.copy()
b[0, 0] = 10
print(a)
print(b)
```

## 行列の操作

```python
import numpy as np

a = np.array([[1, 2, 3], [4, 5, 6]])

# 行列式
print(np.linalg.det(a))

# 逆行列
print(np.linalg.inv(a))

# 固有値と固有ベクトル
print(np.linalg.eig(a))

# 特異値分解
print(np.linalg.svd(a))
```

## 行列の計算

```python
import numpy as np

a = np.array([[1, 2, 3], [4, 5, 6]])
b = np.array([[7, 8, 9], [10, 11, 12]])

# 行列の和
print(a + b)

# 行列の差
print(a - b)

# 行列の積
print(a.dot(b))

# 要素の和
print(np.sum(a))

# 要素の平均
print(np.mean(a))

# 要素の最大値
print(np.max(a))

# 要素の最小値
print(np.min(a))

# 要素の合計
print(np.sum(a, axis=0))
print(np.sum(a, axis=1))

# 要素の積
print(np.prod(a))

# 要素の積の和
print(np.prod(a, axis=0))
print(np.prod(a, axis=1))

# 要素の累積和
print(np.cumsum(a))
print(np.cumsum(a, axis=0))
print(np.cumsum(a, axis=1))

# 要素の累積積
print(np.cumprod(a))
print(np.cumprod(a, axis=0))
print(np.cumprod(a, axis=1))

# 要素の累積最大値
print(np.maximum.accumulate(a))
print(np.maximum.accumulate(a, axis=0))
print(np.maximum.accumulate(a, axis=1))

# 要素の累積最小値
print(np.minimum.accumulate(a))
print(np.minimum.accumulate(a, axis=0))
print(np.minimum.accumulate(a, axis=1))

# 要素の累積積の和
print(np.multiply.accumulate(a))
print(np.multiply.accumulate(a, axis=0))
print(np.multiply.accumulate(a, axis=1))

# 要素の累積積の積
print(np.multiply.accumulate(a))
print(np.multiply.accumulate(a, axis=0))
print(np.multiply.accumulate(a, axis=1))

# 要素の累積積の積の和
print(np.add.accumulate(a))
print(np.add.accumulate(a, axis=0))
print(np.add.accumulate(a, axis=1))

# 要素の累積積の積の積
print(np.add.accumulate(a))
print(np.add.accumulate(a, axis=0))
print
