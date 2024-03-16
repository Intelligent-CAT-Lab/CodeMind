import sys

MOD=1000000007

def main():
	sc=sys.stdin
	#åºå¥ã§ãããã¼ã«ãåºå¥ã§ããç®±ã«å
¥ããå
¥ãæ¹ã¯ã
	#1ã¤ã®ãã¼ã«ã«ä»ããç®±ã®åæ°éãæããããããç¬ç«ãªã®ã§ã
	#n kãä¸ããããæ k^nã§ããã
	n=int(sc.readline())
	k=int(sc.readline())
	ans=1
	for i in range(n):
		ans=(ans*k)%MOD
	print(ans)

if __name__ == '__main__':
	main()