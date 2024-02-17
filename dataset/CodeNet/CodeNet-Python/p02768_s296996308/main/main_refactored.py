class main:
	mod = 1000000007
	
	def mod_cmb(n: int, k: int, p: int) -> int:
	    if n < 0 or k < 0 or n < k: return 0
	    if n == 0 or k == 0: return 1
	    if (k > n - k):
	        return mod_cmb(n, n - k, p)
	    c = d = 1
	    for i in range(k):
	        c *= (n - i)
	        d *= (k - i)
	        c %= p
	        d %= p
	    return c * pow(d, -1, p) % p
	
	def main():
	    n, a, b = list(map(int, input().split()))
	
	    ans = pow(2, n, mod) - 1
	
	    tmp_a = mod_cmb(n , a, mod)
	    tmp_b = mod_cmb(n , b, mod)
	
	    print(((ans-tmp_a-tmp_b)%mod))
	
	if __name__ == '__main__':
	    main()
