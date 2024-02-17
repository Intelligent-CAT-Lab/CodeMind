text = 'mTYWLMwbLRVOqNEf.oLsYkZORKE[Ko[{n'
if text and text.isupper():
    cs = str.maketrans(string.ascii_uppercase, string.ascii_lowercase)
    print(text.translate(cs))
else:
    print(text.lower()[:3])