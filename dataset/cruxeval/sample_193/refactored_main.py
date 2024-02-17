string = '1::1'
count = string.count(':')
print(string.replace(':', '', count - 1))