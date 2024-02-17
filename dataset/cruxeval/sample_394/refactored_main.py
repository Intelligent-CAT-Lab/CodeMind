text = "2 m2 \n\nbike"
k = text.splitlines()
i = 0
for j in k:
    if len(j) == 0:
        print(i)
    i+=1
print(-1)