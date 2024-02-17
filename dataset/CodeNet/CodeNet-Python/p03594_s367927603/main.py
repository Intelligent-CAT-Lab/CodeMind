H, W, d = map(int, input().split())
if d%2 == 1:
	for i in range(H):
		print(*["R" if (i+j)%2 == 0 else "Y" for j in range(W)], sep="")
else:
	for i in range(H):
		ans = ""
		for j in range(W):
			if (i+j) % (2*d) < d and (i-j) % (2*d) < d:
				ans += "R"
			elif (i+j) % (2*d) >= d and (i-j) % (2*d) < d:
				ans += "Y"
			elif (i+j) % (2*d) < d and (i-j) % (2*d) >= d:
				ans += "G"
			else:
				ans += "B"
		print(ans)