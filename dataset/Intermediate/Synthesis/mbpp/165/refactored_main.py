str1 = "xbcefg"
count_chars = 0
for i in range(len(str1)):
    if ((i == ord(str1[i]) - ord('A')) or 
        (i == ord(str1[i]) - ord('a'))): 
        count_chars += 1
print(count_chars)