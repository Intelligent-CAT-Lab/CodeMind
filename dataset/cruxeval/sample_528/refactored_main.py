s = 'papeluchis'
b = ''
c = ''
for i in s:
    c = c + i
    if s.rfind(c) > -1:
        return_val = s.rfind(c)
        print(return_val)
        break