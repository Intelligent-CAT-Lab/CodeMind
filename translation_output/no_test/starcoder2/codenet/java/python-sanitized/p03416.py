a = int(input())
b = int(input())
count = 0
for i in range(a, b+1):
    array = [int(x) for x in str(i)]
    if array[0] == array[4] and array[1] == array[3]:
        count += 1
print(count)