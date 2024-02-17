class main:
	h,w=list(map(int,input().split()))
	if(h%3==0 or w%3==0):
	    print((0))
	    quit()
	def main(h,w):
	    a=h
	    for i in range(1,h//2+1):
	        l=[i*w,(h-i)*(w//2),(h-i)*(w-w//2)]
	        a=min(max(l)-min(l),a)
	    return a
	print((min(main(h,w),main(w,h))))