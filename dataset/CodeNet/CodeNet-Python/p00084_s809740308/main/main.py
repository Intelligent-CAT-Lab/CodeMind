l = str(eval(input()));
s = l.split(',');
a = ''.join(s);
b = a.split('.');
c = ''.join(b);
d = c.split(' ');
L = [];
for i in range(0,len(d)):
    if len(d[i]) >= 3 and len(d[i]) <= 6:
        L.append(d[i]);
        
print((' '.join(L)));
