file_name = "example.txt"
suf = ['txt', 'exe', 'dll']
lst = file_name.split(sep='.')
if len(lst) != 2:
    print('No')
if not lst[1] in suf:
    print('No')
if len(lst[0]) == 0:
    print('No')
if not lst[0][0].isalpha():
    print('No')
t = len([x for x in lst[0] if x.isdigit()])
if t > 3:
    print('No')
print('Yes')