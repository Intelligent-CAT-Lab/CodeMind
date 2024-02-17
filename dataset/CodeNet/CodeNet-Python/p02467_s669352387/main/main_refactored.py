class main:
	# NTL_1_A - Prime Factorization
	def prime_factorization(x: int) -> dict:
	    """
	    Prime factorization of a number (trial division)
	    
	    Args: x (int): a number to be resolved
	    Return: ret (dict): {prime factor: power}
	    
	    e.g., n = 2^a * 3^b -> {2: a, 3: b}
	    """
	    max_prime, ret = 0, {}
	    cnt = 0
	    while x % 2 == 0:  # divide x by 2 as much as possible
	        x //= 2
	        cnt += 1
	    if cnt > 0:
	        max_prime = 2
	        ret[max_prime] = cnt
	
	    cnt = 0
	    for i in range(3, int(x ** 0.5) + 1, 2):
	        cnt = 0
	        while x % i == 0:
	            x //= i
	            max_prime = i
	            cnt += 1
	        if cnt > 0:
	            ret[max_prime] = cnt
	
	    if x > 2:  # when x is prime greater than 2
	        max_prime = x
	        ret[max_prime] = 1
	    return ret
	
	
	def main():
	    N = int(eval(input()))
	    facts = prime_factorization(N)
	    ans = f"{N}: "
	    for prime, cnt in list(facts.items()):
	        ans += f"{prime} " * cnt
	    print((ans[:-1]))
	
	
	if __name__ == "__main__":
	    main()
