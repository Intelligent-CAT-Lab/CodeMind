class main:
	# 2019-11-28 00:55:58(JST)
	import sys
	def main():
	    digits = sorted(sys.stdin.readline().split())
	    
	    if digits == list('1479'):
	        print('YES')
	    else:
	        print('NO')
	
	if __name__ == '__main__':
	    main()