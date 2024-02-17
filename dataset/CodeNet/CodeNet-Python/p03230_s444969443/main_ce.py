def main():
	n = int("3")
	l = []
	i = 1
	while n > 0:
		n -= i
		t = i * (i - 1) // 2
		l += [list(range(t + 1, t + i + 1))]
		i += 1
	if n < 0:
		print("No")
		exit()
	print("Yes")
	i -= 1
	ans = [i + 1] + [i] + [l[j][-1] for j in range(i)]
	for j in range(i):
		ans += [i] + l[j] + [l[k][j] for k in range(j + 1, i)]
	print(" ".join(map(str, ans)))
	
if __name__=="__main__":
	main()
