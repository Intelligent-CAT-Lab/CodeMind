s = input()
c_index = s.find('C')
f_index = s.rfind('F')
if c_index < 0 or f_index < 0 or f_index < c_index:
    print("No")
else:
    print("Yes")