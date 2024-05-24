text = "aab_cbbbc"
patterns = '^[a-z]+_[a-z]+$'
if re.search(patterns,  text):
        print(True)
else:
        print(False)