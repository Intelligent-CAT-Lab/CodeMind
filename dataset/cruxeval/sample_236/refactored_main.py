array = ['ac8', 'qk6', '9wg']
if len(array) == 1:
    print(''.join(array))
result = list(array)
i = 0
while i < len(array)-1:
    for j in range(2):
        result[i*2] = array[i]
        i += 1
print(''.join(result))