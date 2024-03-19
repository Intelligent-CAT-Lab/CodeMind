# Sample test case
N = int(input())

# Expected output
if ord(N) >= ord('A') and ord(N) <= ord('Z'):
    print(-1)
elif ord(N) >= ord('a') and ord(N) <= ord('z'):
    print(1)
else:
    print(-1)