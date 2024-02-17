class main:
	def f(d,x,y):n=int("9"*x+"0"*y);return d==0 if x<1 else sum(f(d+i*n,x-2,y+1)*(10-abs(i)-(y<1))for i in range(-9,10)if abs(d+i*n)<n)
	D=eval(input());print(sum(f(D,i,0)*(10-i%2*9)for i in range(1,21)))