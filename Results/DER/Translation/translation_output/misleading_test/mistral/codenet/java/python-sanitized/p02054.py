# Sample test case
n = int(input())

# Expected output
print("Ho" if sum(int(x) % 2 for x in input().split()) >= 2 else "Tem")