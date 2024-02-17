class main:
	from collections import deque
	a=int(eval(input()))
	list1=deque([1,2,3,4,5,6,7,8,9])
	i=1
	while(i<=a) :
	  #print (list1)
	  if i!=a :
	    k=list1.popleft()
	    k=str(k)
	    if int(k[-1])==0 :
	      list1.append(int(str(k)+'0'))
	      list1.append(int(str(k)+'1'))
	      i+=1
	    elif int(k[-1])==9 :
	      list1.append(int(str(k)+'8'))
	      list1.append(int(str(k)+'9'))
	      i+=1
	    else :
	      list1.append(int(str(k)+str(int(k[-1])-1)))
	      list1.append(int(str(k)+str(int(k[-1]))))
	      list1.append(int(str(k)+str(int(k[-1])+1)))
	      i+=1
	  else :
	    print((list1[0]))
	    break
