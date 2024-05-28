arr1 = [1, 12, 15, 26, 38] 
arr2 = [2, 13, 17, 30, 45]
n = 5
i = 0
j = 0
m1 = -1
m2 = -1
count = 0
while count < n + 1:
  count += 1
  if i == n:
    m1 = m2
    m2 = arr2[0]
    break
  elif j == n:
    m1 = m2
    m2 = arr1[0]
    break
  if arr1[i] <= arr2[j]:
    m1 = m2
    m2 = arr1[i]
    i += 1
  else:
    m1 = m2
    m2 = arr2[j]
    j += 1
print((m1 + m2)/2)