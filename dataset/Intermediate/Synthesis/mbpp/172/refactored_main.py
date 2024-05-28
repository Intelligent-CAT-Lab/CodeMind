s = "letstdlenstdporstd"
count = 0
for i in range(len(s) - 2):
    if (s[i] == 's' and s[i+1] == 't' and s[i+2] == 'd'):
      count = count + 1
print(count)