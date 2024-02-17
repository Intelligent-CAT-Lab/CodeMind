import sys
from functools import lru_cache
sys.setrecursionlimit(500000)
mod = 10**9+7
@lru_cache(maxsize=None)
def partition(n, k):  # 自然数 n を k 個の自然数の和で表す場合の数
    if n < 0 or n < k:
        return 0
    elif k == 1 or n == k:
        return 1
    else:
        return (partition(n-k, k) + partition(n-1, k-1)) % mod  # 1 を使わない場合と使う場合の和
n, k = map(int, "5 3".split())
print(partition(n+k, k))
