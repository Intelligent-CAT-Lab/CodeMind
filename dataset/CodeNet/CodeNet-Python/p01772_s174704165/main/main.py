S = input()
A = False
c = 0
for s in S:
    A |= s == "A"
    if s == "Z" and A:
        c += 1
        A = False
print("AZ"*c if c > 0 else -1)