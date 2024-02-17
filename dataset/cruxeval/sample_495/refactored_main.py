s = 'a1234år'
if str.isascii(s[-5:]):
    print(s[-5:], s[0:][:3])
elif str.isascii(s[:5]):
    print(s[:5], s[-5:][3:])
else:
    print(s)