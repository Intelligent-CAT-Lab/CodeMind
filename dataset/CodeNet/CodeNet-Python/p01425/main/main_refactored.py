class main:
	def calc(vy,t):
	     return vy*t - g/2*t*t
	
	def cmp(lb,ub,x):
	     if x < lb + eps:
	          return -1
	     elif x > ub - eps:
	          return 1
	     return 0
	
	def check(qx,qy):
	     if qx == 0:
	          return 0
	     a = g*g/4
	     b = qy*g-V*V
	     c = qx*qx+qy*qy
	     D = b*b-4*a*c
	     if D < -eps:
	          return 0
	     if -eps<=D<0:
	          D = 0
	     for d in (-1,1):
	          tt = (-b+d*D**.5)/(2*a)
	          if tt <= 0:
	               continue
	          t = tt**.5
	          vx = qx/t
	          vy = qy/t+g*t/2
	          if calc(vy,X/vx) < Y - eps:
	               return 0
	          for L,B,R,T in obstacles:
	               l = cmp(B,T,calc(vy,L/vx))
	               r = cmp(B,T,calc(vy,R/vx))
	               xh = cmp(L,R,vx*(vy/g))
	               yh = cmp(B,T,calc(vy,vy/g))
	               if l*r <= 0 or not xh and yh*l <= 0:
	                    break
	          else:
	               return 1
	     return 0
	
	g = 9.8
	eps = 1e-10
	N,V,X,Y = list(map(int,input().split()))
	obstacles = []
	for i in range(N):
	     L,B,R,T = list(map(int,input().split()))
	     if L < X:
	          obstacles.append((L,B,min(R,X),T))
	
	if check(X,Y):
	     print('Yes')
	     exit()
	for L,B,R,T in obstacles:
	     if not L or not R:
	          continue
	     if check(L,T) or check(R,T):
	          print('Yes')
	          exit()
	print('No')
	
