text = 'hello.txt'
suffix = '/'
if suffix.startswith("/"):
    print(text + suffix[1:])
else:
    print(text)