# NOTE: In Python, there is no explicit need to import specific classes for basic I/O operations, as they are built-in functions.

MOD = 1000000007

def main():
	# Read two space-separated integers from input
	n, k = map(int, input().split())
	ans = 1
	for i in range(n):
		ans = (ans * k) % MOD
	print(ans)

if __name__ == "__main__":
	main()