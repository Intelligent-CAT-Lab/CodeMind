
str1 = eval(input()) + "ooooooooooooooo"

count1 = 0

for i in range(15):
    if str1[i] == "o":
        count1 +=1

if count1 >= 8:
    print("YES")
else:
    print("NO")