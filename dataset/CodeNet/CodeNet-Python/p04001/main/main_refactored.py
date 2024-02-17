class main:
	def dfs(i,sep,s,tot):
	    n = len(s)
	    i += 1
	
	    # 最深部まで到達した時
	    if i == n:
	        ans = 0
	        if len(sep)>1:
	            for j in range(len(sep)-1):
	                ans += int(s[sep[j]:sep[j+1]])
	        ans += int(s[sep[-1]:])
	        return ans
	
	    # i番目に+を入れる時
	    sep.append(i)
	    tot += dfs(i,sep,s, 0)
	
	    # i番目に+を入れない時
	    sep.pop()
	    tot += dfs(i,sep,s, 0)
	
	    return tot
	
	s = eval(input())
	print((dfs(0,[0],s,0)))