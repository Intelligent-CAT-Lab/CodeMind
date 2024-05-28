text = "ac"
patterns = 'ab+?'
if re.search(patterns,  text):
    print(True)
else:
    print(False)