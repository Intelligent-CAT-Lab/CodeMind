s = 'ababa'
suffix = 'ab'

if not suffix:
    print(s)
while s.endswith(suffix):
    s = s[:-len(suffix)]
print(s)