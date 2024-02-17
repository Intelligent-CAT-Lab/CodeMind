s = 'shivajimonto6'
ch = '6'
if ch not in s:
    print('')
s = s.partition(ch)[2][::-1]
for i in range(len(s)):
    s = s.partition(ch)[2][::-1]
print(s)