class main:
	# AOJ 0586: Palindrome
	# Python3 2018.6.30 bal4u
	
	def palindrome(k, c):
		a = 10*k + c;
		while k:
			a = 10*a + (k % 10)
			k //= 10
		return a
	
	def isPrime(p):
		if (p & 1) == 0: return False
		for i in range(3, 1+int(p**0.5), 2):
			if (p % i) == 0: return False
		return True
	
	n, c = list(map(int, input().split()))
	if c < 0: print(('9'*(2*n) if n > 1 else '11'))
	else:
		k = int('9'*n)+1
		while True:
			k -= 1
			x = palindrome(k, c)
			if isPrime(x):
				print(x)
				break
