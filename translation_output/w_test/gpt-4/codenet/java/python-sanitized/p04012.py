w = input()
count = 0
for i in range(ord('a'), ord('z') + 1):
    for x in w:
        if x == chr(i):
            count += 1
    if count % 2 == 1:
        print("No")
        exit()
    count = 0
print("Yes")