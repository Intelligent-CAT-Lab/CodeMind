class main:
    def combination(target, k, lst):
    	global v
    	if len(lst) == k:
    		v += 1
    		for i in lst:
    			ansList[i].append(v)
    		return
    
    	i = 0
    	if len(lst) > 0:
    		i = lst[-1] + 1
    		if len(lst) + len(target) - i < k:
    			return
    
    	for j in range(i, len(target)):
    		lst.append(j)
    		combination(target, k, lst)
    		lst.pop()
    
    v = 0
    ansList = None
    
    if __name__ == "__main__":
    	n = int(input())
    
    	if n == 1:
    		print("Yes")
    		print(2)
    		print("1 1")
    		print("1 1")
    		exit()
    
    	if n == 2:
    		print("No")
    		exit()
    
    	k = 0
    	for i in range(3, n+1):
    		ic2 = i * (i - 1) // 2
    		if ic2 == n:
    			k = i
    			break
    		elif ic2 > n:
    			print("No")
    			exit()
    
    	print("Yes")
    
    	ansList = [[] for _ in range(k)]
    	target = [i for i in range(k)]
    	combination(target, 2, [])
    
    	print(k)
    	for i in range(k):
    		sb = [str(k-1)]
    		for j in ansList[i]:
    			sb.append(str(j))
    		print(" ".join(sb))