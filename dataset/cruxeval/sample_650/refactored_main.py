string = ''
substring = 'A'
while string.startswith(substring):
    string = string[len(substring):len(string)]
print(string)