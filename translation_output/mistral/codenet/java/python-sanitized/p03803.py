import sys

a = int(input())
b = int(input())

if a == 1:
    if b != 1:
        print("Alice")
else:
    print("Bob")

if b == 1:
    if a != 1:
        print("Bob")
else:
    print("Alice")

if a > b and a != 1 and b != 1:
    print("Alice")
elif a < b and a != 1 and b != 1:
    print("Bob")
else:
    print("Draw")