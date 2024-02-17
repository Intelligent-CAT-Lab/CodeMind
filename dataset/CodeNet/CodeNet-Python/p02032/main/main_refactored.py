class main:
	import sys
	sys.setrecursionlimit(10 ** 5 + 10)
	def input(): return sys.stdin.readline().strip()
	
	def resolve():
	    n=int(eval(input()))
	    import math
	    
	    
	    # cf. https://qiita.com/suecharo/items/14137fb74c26e2388f1f
	    def make_prime_list_2(num):
	        if num < 2:
	            return []
	    
	        # 0のものは素数じゃないとする
	        prime_list = [i for i in range(num + 1)]
	        prime_list[1] = 0  # 1は素数ではない
	        num_sqrt = math.sqrt(num)
	    
	        for prime in prime_list:
	            if prime == 0:
	                continue
	            if prime > num_sqrt:
	                break
	    
	            for non_prime in range(2 * prime, num, prime):
	                prime_list[non_prime] = 0
	    
	        return [prime for prime in prime_list if prime != 0]
	    
	    
	    def prime_factorization_2(num):
	        """numの素因数分解
	        素因数をkeyに乗数をvalueに格納した辞書型dict_counterを返す"""
	    
	        if num <= 1:
	            # 例えば1を食ったときの対処の仕方は問題によって違うと思うのでそのつど考える。
	            # cf. https://atcoder.jp/contests/abc110/submissions/12688244
	            return False
	        else:
	            num_sqrt = math.floor(math.sqrt(num))
	            prime_list = make_prime_list_2(num_sqrt)
	    
	            dict_counter = {}  # 何度もこの関数を呼び出して辞書を更新したい時はこれを引数にして
	            # cf. https://atcoder.jp/contests/arc034/submissions/12251452
	    
	            for prime in prime_list:
	                while num % prime == 0:
	                    if prime in dict_counter:
	                        dict_counter[prime] += 1
	                    else:
	                        dict_counter[prime] = 1
	                    num //= prime
	            if num != 1:
	                if num in dict_counter:
	                    dict_counter[num] += 1
	                else:
	                    dict_counter[num] = 1
	    
	            return dict_counter
	    d=prime_factorization_2(n)
	    val=1
	    for v in list(d.values()):
	        val*=(v+1)
	    print((len(d),val-1))
	
	    
	resolve()
