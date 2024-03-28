n = int(input())

result = []
for i in range(1, int(n**(1/2)+1)):
    if n%i==0:
        result.append(max(len(str(i)), len(str(n//i))))
print(min(result))