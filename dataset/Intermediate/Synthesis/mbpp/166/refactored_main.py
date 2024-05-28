A = [5, 4, 7, 2, 1]
count = 0
for i in range(0, len(A)): 
  for j in range(i+1, len(A)): 
      if ((A[i] ^ A[j]) % 2 == 0): 
        count += 1
print(count)