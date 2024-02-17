class main:
	h, w = list(map(int, input().split()))
	
	ans = 10 ** 10
	if (h % 3 == 0) or (w % 3 == 0):
	    ans = 0
	# 半分 or 半分+1 で切って全探索
	else:
	    if h % 3 == 1:
	        Sa = int(h//3) * w
	        Sb = int(h//3) * w
	        Sc = (int(h//3)+1) * w
	        dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
	        ans = min(ans, dif)
	    elif h % 3 == 2:
	        Sa = int(h//3) * w
	        Sb = (int(h//3)+1) * w
	        Sc = (int(h//3)+1) * w
	        dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
	        ans = min(ans, dif)
	    
	    if w % 3 == 1:
	        Sa = int(w//3) * h
	        Sb = int(w//3) * h
	        Sc = (int(w//3)+1) * h
	        dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
	        ans = min(ans, dif)
	    elif w % 3 == 2:
	        Sa = int(w//3) * h
	        Sb = (int(w//3)+1) * h
	        Sc = (int(w//3)+1) * h
	        dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
	        ans = min(ans, dif)
	
	    if h % 2 == 0:
	        for i in range(1,w):
	            Sa = int(h/2) * i
	            Sc = h * (w-i)
	            dif = abs(Sa-Sc)
	            ans = min(ans, dif)
	    elif h % 2 == 1:
	        for i in range(1,w):
	            Sa = int(h // 2)  * i
	            Sb = (int(h // 2) + 1) * i
	            Sc = h * (w-i)
	            dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
	            ans = min(ans, dif)
	        
	    if w % 2 == 0:
	        for j in range(1,h):
	            Sa = int(w/2) * j
	            Sc = w * (h-j)
	            dif = abs(Sa-Sc)
	            ans = min(ans, dif)
	    elif w % 2 == 1:
	        for j in range(1,h):
	            Sa = int(w // 2)  * j
	            Sb = (int(w // 2) + 1) * j
	            Sc = w * (h-j)
	            dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
	            ans = min(ans, dif)
	print(ans)
