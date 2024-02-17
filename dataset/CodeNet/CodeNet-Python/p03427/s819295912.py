n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))