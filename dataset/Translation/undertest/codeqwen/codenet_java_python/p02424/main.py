def to_string(x):
    return bin(x)[2:].zfill(32)

a = int(input())
b = int(input())

print(to_string(a & b))
print(to_string(a | b))
print(to_string(a ^ b))