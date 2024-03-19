n, l = map(int, input().split())
diff = [l + i - 1 for i in range(1, n+1)]
diff.append(0)
removeK = diff.index(min(diff)) + 1
print(n*l + n*(n+1)//2 - n - (l+ removeK -1))