full = 'hrsiajiajieihruejfhbrisvlmmy'
part = 'hr'
length = len(part)
index = full.find(part)
count = 0
while index >= 0:
    full = full[index + length:]
    index = full.find(part)
    count += 1
print(count)