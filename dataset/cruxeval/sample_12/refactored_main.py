s = 'If you want to live a happy life! Daniel'
x = 'Daniel'
count = 0
while s[:len(x)] == x and count < len(s)-len(x):
    s = s[len(x):]
    count += len(x)
print(s)