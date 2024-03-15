days = ["MON", "TUE", "WED", "THU", "FRI","SAT","SUN"]
inpt = input()
idx = 0
for i in range(len(days)):
    if days[i] == inpt:
        idx = i
        break
ans = ((6-idx+7)%7)
if ans == 0:
    print(7)
else:
    print(ans)