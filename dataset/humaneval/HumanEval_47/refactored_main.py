l = [3, 1, 2, 4, 5]
l = sorted(l)
if len(l) % 2 == 1:
    answer = l[len(l) // 2]
else:
    answer = (l[len(l) // 2 - 1] + l[len(l) // 2]) / 2.0
print(answer)