n = int(input())
minute = 12 * 60 * n // 360
print(f"{minute // 60} {minute % 60}")