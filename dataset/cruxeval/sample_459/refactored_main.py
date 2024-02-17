arr = ['b', 'vzjmc', 'f', 'ae', '0']
d = dict()
for i in range(1, len(arr), 2):
    d.update({arr[i]: arr[i-1]})
print(d)