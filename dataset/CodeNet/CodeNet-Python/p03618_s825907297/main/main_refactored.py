class main:
	def main():
	     s = list(eval(input()))
	     count = int((len(s)*(len(s)-1))/2+1)
	     dic = {}
	     for i in range(len(s)):
	         try:
	             dic[s[i]].append(i)
	         except Exception:
	             dic[s[i]] = [i]
	
	     for j in list(dic.values()):
	         count-=int((len(j)*(len(j)-1))/2)
	     print(count)
	
	
	if __name__=="__main__":
	    main()