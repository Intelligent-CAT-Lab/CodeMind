import sys

def check(i, c):
	builder = str(i) + str(c) + str(i)[::-1]
	if prime(int(builder)):
		print builder
		return True
	else:
		return False

def prime(b):
	for i in range(2, b):
		if b % i == 0:
			return False
	return True

def main():
	n = int(sys.stdin.readline())
	c = int(sys.stdin.readline())
	if c < 0:
		if n == 1:
			print 11
		else:
			for i in range(n * 2):
				print 9
			print
	else:
		a = 1
		for i in range(n):
			a *= 10
		b = a / 10
		a -= 1
		for i in range(a, b - 1, -1):
			if check(i, c):
				return

if __name__ == '__main__':
	main()