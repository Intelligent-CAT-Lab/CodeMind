XAAXX = 'aaXXXXbbXXXXccXXXXde'
s = 'QW'
count = 0
idx = -1
while XAAXX.find('XXXX', idx+1) != -1:
    idx = XAAXX.find('XXXX', idx+1) 
    count += 1 
compound = count * s.title()
print(XAAXX.replace('XXXX', compound))