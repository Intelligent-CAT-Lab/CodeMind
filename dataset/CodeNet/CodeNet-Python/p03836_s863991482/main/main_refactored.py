class main:
	sx, sy, tx, ty = list(map(int, input().split()))
	w = tx - sx 
	h = ty - sy 
	ans = ""
	for _ in range(h):
	  ans += "U"
	for _ in range(w):
	  ans += "R"
	for _ in range(h):
	  ans += "D"
	for _ in range(w):
	  ans += "L"
	
	ans += "L"
	for _ in range(h+1):
	  ans += "U"
	for _ in range(w+1):
	  ans += "R"
	ans += "D"
	ans += "R"
	for _ in range(h+1):
	  ans += "D"
	for _ in range(w+1):
	  ans += "L"
	ans += "U"
	print(ans)