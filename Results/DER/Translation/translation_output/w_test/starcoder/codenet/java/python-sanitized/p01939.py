MOD = 1000000007

def main():
	first_N = int(raw_input())
	first_M = int(raw_input())

	if first_N == 1:
		print (first_M+1)%MOD
	else:
		if (first_M+1)%(first_N-1) == 0:
			first_limit = (first_M+1)/(first_N-1)-1
		else:
			first_limit = (first_M+1)/(first_N-1)

		if first_limit <= 0:
			print (first_M+1)%MOD
		else:
			A = first_M+1
			B = 2*(first_M+1)
			C = first_N-1
			C = C*(first_limit+1)
			A = A+B-C
			print A%MOD

if __name__ == '__main__':
	main()