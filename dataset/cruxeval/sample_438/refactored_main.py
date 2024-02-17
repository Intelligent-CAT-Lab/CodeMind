string = '1  \t\t\t3'
bigTab = 100
for i in range(10, 30):
    if 0 < string.count('\t') < 20:
        bigTab = i
        break
print(string.expandtabs(bigTab))