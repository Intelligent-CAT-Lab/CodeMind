# We don't need to import any scanner, as Python has built-in input functionality.

a = int(input())
b = int(input())

d = a // b  # Integer division
r = a % b
f = f"{a / b:.5f}"  # Floating-point division formatted to 5 decimal places

print(f"{d} {r} {f}")