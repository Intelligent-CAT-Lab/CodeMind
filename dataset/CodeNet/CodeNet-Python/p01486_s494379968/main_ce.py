import re
s="mmemewwemeww"
while s!=re.sub(r'(m|e)mew(e|w)','\\1\\2',s):s=re.sub(r'(m|e)mew(e|w)','\\1\\2',s)
print(['Rabbit','Cat'][s=='mew'])