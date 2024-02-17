n = 1
streak = ''
for c in str(n):
    streak += c.ljust(int(c) * 2)
print(streak)