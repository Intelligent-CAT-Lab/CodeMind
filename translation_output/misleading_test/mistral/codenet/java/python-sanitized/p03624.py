string = input()
count = [0]*26
alphabet = 'abcdefghijklmnopqrstuvwxyz'
for char in string:
    count[ord(char)-97] += 1
for i in range(len(count)):
    if count[i] == 0:
        print(alphabet[i])
        break
else:
    print("None")