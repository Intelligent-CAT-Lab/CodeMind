class main:
	from functools import reduce
	def main():
	
	    """ convenient functions
	    # for i, a in enumerate(iterable)
	    # q, mod = divmod(a, b)
	    # divmod(x, y) returns the tuple (x//y, x%y)
	    # Higher-order function: reduce(operator.mul, xyz_count, 1)
	    # manage median(s) using two heapq https://atcoder.jp/contests/abc127/tasks/abc127_f
	    """
	
	    """convenient decorator
	    # @functools.lru_cache():
	    # to facilitate use of recursive function
	        # ex:
	        # from functools import lru_cache
	        # import sys
	        # sys.setrecursionlimit(10**9)
	        # @lru_cache(maxsize=None)
	        # def fib(n):
	        #     if n < 2:
	        #         return n
	        #     return fib(n-1) + fib(n-2)
	        # print(fib(1000))
	    """
	    
	    # import numpy as np
	    import sys
	    sys.setrecursionlimit(10**7)
	    from itertools import accumulate, combinations, permutations, product # https://docs.python.org/ja/3/library/itertools.html
	    # accumulate() returns iterator! to get list: list(accumulate())
	    from math import factorial, ceil, floor, sqrt
	    def factorize(n):
	        """return the factors of the Arg and count of each factor
	        
	        Args:
	            n (long): number to be resolved into factors
	        
	        Returns:
	            list of tuples: factorize(220) returns [(2, 2), (5, 1), (11, 1)]
	        """
	        fct = []  # prime factor
	        b, e = 2, 0  # base, exponent
	        while b * b <= n:
	            while n % b == 0:
	                n = n // b
	                e = e + 1
	            if e > 0:
	                fct.append((b, e))
	            b, e = b + 1, 0
	        if n > 1:
	            fct.append((n, 1))
	        return fct
	    def combinations_count(n, r):
	        """Return the number of selecting r pieces of items from n kinds of items.
	        
	        Args:
	            n (long): number
	            r (long): number
	        
	        Raises:
	            Exception: not defined when n or r is negative
	        
	        Returns:
	            long: number
	        """
	        # TODO: How should I do when n - r is negative?
	        if n < 0 or r < 0:
	            raise Exception('combinations_count(n, r) not defined when n or r is negative')
	        if n - r < r: r = n - r
	        if r < 0: return 0
	        if r == 0: return 1
	        if r == 1: return n
	        numerator = [n - r + k + 1 for k in range(r)]
	        denominator = [k + 1 for k in range(r)]
	        for p in range(2,r+1):
	            pivot = denominator[p - 1]
	            if pivot > 1:
	                offset = (n - r) % p
	                for k in range(p-1,r,p):
	                    numerator[k - offset] /= pivot
	                    denominator[k] /= pivot
	        result = 1
	        for k in range(r):
	            if numerator[k] > 1:
	                result *= int(numerator[k])
	        return result
	    def combinations_with_replacement_count(n, r):
	        """Return the number of selecting r pieces of items from n kinds of items allowing individual elements to be repeated more than once.
	        
	        Args:
	            n (long): number
	            r (long): number
	        
	        Raises:
	            Exception: not defined when n or r is negative
	        
	        Returns:
	            long: number
	        """
	        if n < 0 or r < 0:
	            raise Exception('combinations_with_replacement_count(n, r) not defined when n or r is negative')
	        elif n == 0:
	            return 1
	        else:
	            return combinations_count(n + r - 1, r)
	    from bisect import bisect_left, bisect_right
	    from collections import deque, Counter, defaultdict # https://docs.python.org/ja/3/library/collections.html#collections.deque
	    from heapq import heapify, heappop, heappush, heappushpop, heapreplace,nlargest,nsmallest # https://docs.python.org/ja/3/library/heapq.html
	    from copy import deepcopy, copy # https://docs.python.org/ja/3/library/copy.html
	    import operator
	    from operator import itemgetter
	    # ex1: List.sort(key=itemgetter(1))
	    # ex2: sorted(tuples, key=itemgetter(1,2))
	    from functools import reduce, lru_cache
	    def chmin(x, y):
	        """change minimum
	        if x > y, x = y and return (x, True).
	        convenient when solving problems of dp[i]
	        
	        Args:
	            x (long): current minimum value
	            y (long): potential minimum value
	        
	        Returns:
	            (x, bool): (x, True) when updated, else (x, False)
	        """
	        if x > y:
	            x = y
	            return (x, True)
	        else:
	            return (x, False)
	    def chmax(x, y):
	        """change maximum
	        if x < y, x = y and return (x, True).
	        convenient when solving problems of dp[i]
	        
	        Args:
	            x (long): current maximum value
	            y (long): potential maximum value
	        
	        Returns:
	            (x, bool): (x, True) when updated, else (x, False)
	        """
	        if x < y:
	            x = y
	            return (x, True)
	        else:
	            return (x, False)
	
	    from fractions import gcd # Deprecated since version 3.5: Use math.gcd() instead.
	    def gcds(numbers):
	        return reduce(gcd, numbers)
	    def lcm(x, y):
	        return (x * y) // gcd(x, y)
	    def lcms(numbers):
	        return reduce(lcm, numbers, 1)
	
	    # first create factorial_list
	    # fac_list = mod_factorial_list(n)
	    INF = 10 ** 18
	    MOD = 10 ** 9 + 7
	    modpow = lambda a, n, p = MOD: pow(a, n, p) # Recursive function in python is slow!
	    def modinv(a, p = MOD):
	        # evaluate reciprocal using Fermat's little theorem:
	        # a**(p-1) is identical to 1 (mod p) when a and p is coprime
	        return modpow(a, p-2, p)
	    def modinv_list(n, p = MOD):
	        if n <= 1:
	            return [0,1][:n+1]
	        else:
	            inv_t = [0,1]
	            for i in range(2, n+1):
	                inv_t += [inv_t[p % i] * (p - int(p / i)) % p]
	            return inv_t
	    def modfactorial_list(n, p = MOD):
	        if n == 0:
	            return [1]
	        else:
	            l = [0] * (n+1)
	            tmp = 1
	            for i in range(1, n+1):
	                tmp = tmp * i % p
	                l[i] = tmp
	            return l
	    def modcomb(n, k, fac_list = [], p = MOD):
	        # fac_list = modfactorial_list(100)
	        # print(modcomb(100, 5, modfactorial_list(100)))
	        from math import factorial
	        if n < 0 or k < 0 or n < k: return 0
	        if n == 0 or k == 0: return 1
	        if len(fac_list) <= n:
	            a = factorial(n) % p
	            b = factorial(k) % p
	            c = factorial(n-k) % p
	        else:
	            a = fac_list[n]
	            b = fac_list[k]
	            c = fac_list[n-k]
	        return (a * modpow(b, p-2, p) * modpow(c, p-2, p)) % p
	    def modadd(a, b, p = MOD):
	        return (a + b) % MOD
	    def modsub(a, b, p = MOD):
	        return (a - b) % p
	    def modmul(a, b, p = MOD):
	        return ((a % p) * (b % p)) % p
	    def moddiv(a, b, p = MOD):
	        return modmul(a, modpow(b, p-2, p))
	
	    """ initialize variables and set inputs
	    # initialize variables
	        # to initialize list, use [0] * n
	        # to initialize two dimentional array, use [[0] * N for _ in range(N)]
	    # set inputs
	        # open(0).read() is a convenient method:
	        # ex) n, m, *x = map(int, open(0).read().split())
	        #     min(x[::2]) - max(x[1::2])
	        # ex2) *x, = map(int, open(0).read().split())
	        #     don't forget to add comma after *x if only one variable is used
	    # preprocessing
	        # transpose = [x for x in zip(*data)]
	        # ex) [[1, 2, 3], [4, 5, 6], [7, 8, 9]] => [(1, 4, 7), (2, 5, 8), (3, 6, 9)]
	        # flat = [flatten for inner in data for flatten in inner]
	        # ex) [[1, 2, 3], [4, 5, 6], [7, 8, 9]] => [1, 2, 3, 4, 5, 6, 7, 8, 9]
	    # calculate and output
	        # output pattern
	        # ex1) print(*l) => when l = [2, 5, 6], printed 2 5 6
	    """
	
	    # functions used
	    r = lambda: sys.stdin.readline().strip()
	    r_int = lambda: int(r())
	    R = lambda: list(map(int, r().split()))
	    Rmap = lambda: list(map(int, r().split()))
	    Rfloat = lambda: list(map(float, r().split()))
	    Rtuple = lambda: tuple(map(int, r().split()))
	
	    """ how to treat input
	    # single int: int(r())
	    # single string: r()
	    # single float: float(r())
	    # line int: R()
	    # line string: r().split()
	    # line (str, int, int): [j if i == 0 else int(j) for i, j in enumerate(r().split())]
	    # lines int: [R() for _ in range(n)]
	    """
	
	    if __name__ != '__main__':
	        # for test
	        sys.stdin = open('sample.txt')
	
	    # ----------------------------------
	    # main
	
	    N, K = R()
	    dp = [[[0]*3100 for _ in range(51)] for _ in range(51)]
	    dp[0][0][0] = 1
	    for i, rest, k in product(list(range(N)), list(range(N)), list(range(K+1))):
	        if k % 2:
	            continue
	        dp[i+1][rest+1][k+2*rest+2] += dp[i][rest][k]
	        dp[i+1][rest+1][k+2*rest+2] %= MOD
	        # if rest:
	        #     dp[i+1][rest][k+2*rest] += dp[i][rest][k] * 2 * rest
	        #     dp[i+1][rest][k+2*rest] %= MOD
	        dp[i+1][rest][k+2*rest] += dp[i][rest][k] * (2*rest+1)
	        dp[i+1][rest][k+2*rest] %= MOD
	        if rest:
	            dp[i+1][rest-1][k+2*rest-2] += dp[i][rest][k] * rest * rest
	            dp[i+1][rest-1][k+2*rest-2] %= MOD
	    print((dp[N][0][K]))
	    
	    
	    # end of main
	    # ----------------------------------
	
	    """memo: how to use defaultdict of list
	    # initialize
	    Dic = defaultdict(list)
	    # append / extend
	    Dic[x].append(y)
	    # for
	    for k, v in Dic.items():
	    """
	
	if __name__ == '__main__':
	    main()