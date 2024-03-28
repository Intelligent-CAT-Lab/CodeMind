import math

def gcd(a,b):
	if b == 0:
		return a
	else:
		return gcd(b,a%b)

def main():
	p,q = map(int,raw_input().split())
	while q % p!= 0:
		p,q = q,p%q
	print q/p

if __name__ == '__main__':
	main()