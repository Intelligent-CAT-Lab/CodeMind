s = input()
arr = list(s)

for i in range(len(arr)):
    if arr[i] == 'b':
        arr[i] = 'd'
    elif arr[i] == 'd':
        arr[i] = 'b'
    elif arr[i] == 'p':
        arr[i] = 'q'
    elif arr[i] == 'q':
        arr[i] = 'p'

arr_reversed = ''.join(arr)[::-1]

if s == arr_reversed:
    print("Yes")
else:
    print("No")