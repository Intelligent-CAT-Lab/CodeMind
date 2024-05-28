import re
text = "ac"
patterns = 'ab{2,3}'
if re.search(patterns,  text):
        print(True)
else:
        print(False)