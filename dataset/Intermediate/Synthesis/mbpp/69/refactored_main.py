l = [2,4,3,5,7]
s = [3,7]
sub_set = False
if s == []:
    sub_set = True
elif s == l:
    sub_set = True
elif len(s) > len(l):
    sub_set = False
else:
    for i in range(len(l)):
        if l[i] == s[0]:
            n = 1
            while (n < len(s)) and (l[i+n] == s[n]):
                n += 1				
            if n == len(s):
                sub_set = True
print(sub_set)