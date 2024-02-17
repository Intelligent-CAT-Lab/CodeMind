class main:
	def gcd(a,b): return b if a%b==0 else gcd(b,a%b)
	def main():
	    a,b,c,d = list(map(int,input().split()))
	    h = abs(b-d)
	    w = abs(c-a)
	    if h==0 or w==0 : return 0
	    m = gcd(max(h,w),min(h,w))
	    return h+w-m
	
	print((main()))
