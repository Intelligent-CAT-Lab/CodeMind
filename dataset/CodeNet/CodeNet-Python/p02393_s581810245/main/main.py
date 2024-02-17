m = list(map(int,input().split()))
a = 0
b = 0
c = 0
if m[0] < m[1] < m[2] or m[0] == m[1] == m[2] or m[0] < m[1] == m[2] or m[0] == m[1] < m[2]:
 print(m[0],m[1],m[2])
elif m[2] < m[0] < m[1] or m[2] < m[0] == m[1] or m[2] == m[0] < m[1]: 
 print(m[2],m[0],m[1])
elif m[1] < m[2] < m[0] or m[1] < m[2] == m[0] or m[1] == m[2] < m[0]: 
 print(m[1],m[2],m[0])
elif m[0] < m[2] < m[1]:
 print(m[0],m[2],m[1])
elif m[2] < m[1] < m[0]:
 print(m[2],m[1],m[0])
elif m[1] < m[0] < m[2]:
 print(m[1],m[0],m[2])