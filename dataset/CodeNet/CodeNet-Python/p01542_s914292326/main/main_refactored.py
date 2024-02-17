class main:
	from itertools import product
	import time
	def ok(s):
	    if '(+' in s or '(-' in s or '(*' in s or '++' in s or '+-' in s or '-+' in s \
	    or '--' in s or '**' in s or '*+' in s or '*-' in s:
	        return False
	    if '(' in s or ')' in s:
	        dic={}
	        count=-1
	        for c in s:
	            if c=='(':
	                count+=1
	                dic[count]=0
	            elif c==')':
	                if dic[count]==0:
	                    return False
	                count-=1
	            elif c in '+-*' and count in dic:
	                dic[count]+=1
	        return True
	    else:
	        return True
	
	def check(s):
	    i=0
	    ans=''
	    tmp=[]
	    try:
	        while i<len(s):
	            if s[i] in '01':
	                tmp.append(s[i])
	            else:
	                if len(tmp):
	                    t=''.join(tmp)
	                    t=str(int(t,2))
	                    if int(t)>=1024:
	                        return -99999999
	                    ans+=t
	                ans+=s[i]
	                tmp=[]
	            i+=1
	        if len(tmp):
	            t=''.join(tmp)
	            t=str(int(t,2))
	            ans+=t
	    except:
	        return -99999999
	    try:
	        if ok(ans):
	            xxx=eval(ans)
	            if '-' not in ans and xxx<1024:
	                return xxx
	            elif '-' in ans and xxx<1024:
	                for i in range(len(ans)):
	                    if ans[i]=='-':
	                        mid=i
	                        r,l=mid-1,mid+1
	                        count=0
	                        while r>=0:
	                            if ans[r]==')':
	                                count+=1
	                            elif ans[r]=='(':
	                                count-=1
	                                if count<0:
	                                    r+=1
	                                    break
	                            if count==0 and ans[r] in '+-':
	                                r+=1
	                                break
	                            r-=1
	                        r=max(r,0)
	                        count=0
	                        while l<len(ans):
	                            if ans[l]=='(':
	                                count+=1
	                            elif ans[l]==')':
	                                count-=1
	                                if count<0:
	                                    break
	                            if count==0 and ans[l] in '+-':
	                                break
	                            l+=1
	                        a,b=eval(ans[r:mid]),eval(ans[mid+1:l])
	                        if a>=1024 or b>=1024 or \
	                        a - b <0:
	                            return -99999999
	                return xxx
	            else:
	                return -99999999
	        else:
	            return -99999999
	    except:
	        return -99999999
	
	s=input().split('.')
	mx=-1
	hoge = product('01+-*()', repeat=len(s)-1)
	for table in hoge:
	    tmp=s[0]
	    i=1
	    for c in table:
	        tmp+=c+s[i]
	        i+=1
	    mx=max(mx,check(tmp))
	print(mx)
	
