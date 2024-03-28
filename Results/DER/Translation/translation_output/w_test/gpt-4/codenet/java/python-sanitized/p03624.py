string = input()
is_NOT_found = False

count = [0] * 26
alphabet = [chr(i) for i in range(97, 123)]
for char in string:
    count[ord(char) - 97] += 1
for i in range(len(count)):
    if count[i] == 0:
        is_NOT_found = True
        break

if is_NOT_found:
    print(alphabet[i])
else:
    print("None")