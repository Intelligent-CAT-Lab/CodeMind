class main:
	#dfs#ans
	n=int(eval(input()))
	
	def dfs(s):
	    #end
	    if int(s)>n:
	        return 0
	    
	    for c in "753":
	        ret=1 if all(s.count(c)>0 for c in "753")else 0
	    for c in "753":
	        ret+=dfs(s+c)
	    return ret
	print((dfs('0')))