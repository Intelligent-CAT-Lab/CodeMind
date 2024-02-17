dic = {}
dic[(0, 0)] = [""]
dic[(1, 0)] = ["A"]
dic[(0, 1)] = ["B"]
for s in range(2, 9):
  for i in range(min(5, s + 1)):
    j = s - i
    if j >= 5 or j <= -1:
      continue
    dic[(i, j)] = []
    if i - 1 >= 0:
      dic[(i, j)] += [lst + "A" for lst in dic[(i - 1, j)]]
    if j - 1 >= 0:
      dic[(i, j)] += [lst + "B" for lst in dic[(i, j - 1)]]
for i in range(4):
  dic[(5, i)] = [lst + "A" for lst in dic[(4, i)]]
  dic[(i, 5)] = [lst + "B" for lst in dic[(i, 4)]]
dic[(5, 4)] = [lst + "A" for lst in dic[(4, 4)]]
dic[(4, 5)] = [lst + "B" for lst in dic[(4, 4)]]
dic[(5, 5)] = [lst + "A" for lst in dic[(4, 5)]] + [lst + "B" for lst in dic[(5, 4)]]
dic[(6, 4)] = [lst + "A" for lst in dic[(5, 4)]]
dic[(4, 6)] = [lst + "B" for lst in dic[(4, 5)]]
j, y = map(int, "2 2".split())
print(*sorted(dic[(j, y)]), sep="\n")
