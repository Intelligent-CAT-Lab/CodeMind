class main:
	# coding:utf-8
	
	input=input()
	list=input.split(" ")
	for i in range(len(list)):
	    list[i]=int(list[i])
	
	e=list[4]
	f=list[5]
	
	# 1 2 10 20 15 200
	# 17 19 22 26 55 2802
	
	# xが取り得る値
	listx=[]
	a=list[0]
	b=list[1]
	
	i=0
	while True:
	   if i*a*100>f:
	       break
	   j=0
	   while True:
	      x=i*a*100+j*b*100
	      if x>f:
	          break;
	      if x==0:
	          j+=1
	          continue;
	      if x not in listx:
	          listx.append(int(x))
	      j+=1 
	   i+=1 
	
	# yが取り得る値
	listy=[]
	c=list[2]
	d=list[3]
	
	# yが水に溶け切れる最大値
	f2=f*e/(100.0+e)
	
	i=0
	while True:
	   if i*c>f2:
	       break
	   j=0
	   while True:
	      y=i*c+j*d
	      if y>f2:
	          break;
	      if y not in listy:
	          listy.append(int(y))
	      j+=1 
	   i+=1 
	
	# 全てのxとyの組み合わせについてfを超えないか、および溶け切れるかを調べる
	lengthx=len(listx)
	lengthy=len(listy)
	
	xy_max=0
	y_max=0
	noudo_max=0
	
	for i in range(lengthx):
	    for j in range(lengthy):
	        x=listx[i]
	        y=listy[j]
	        if x+y>f:
	            continue
	        if float(y)*100/float(x)<=e:
	            noudo=float(y)/(x+y)
	            if noudo>=noudo_max:
	                xy_max=x+y
	                y_max=y
	                noudo_max=noudo
	
	message=str(xy_max)+" "+str(y_max)
	print(message)
