N = int(input())

out = []
while True:
    N -= 1  # Decrement N by 1
    x = N // 26
    y = N % 26
    out.append(chr(ord('a') + y))  # Append the character equivalent to the list
    if x == 0:
        break
    N = x

out_str = ''.join(reversed(out))  # Reverse the list and join to form a string
print(out_str)