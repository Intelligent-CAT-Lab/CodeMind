import re
text = "pythonzabc."
print(bool(re.search(r'\Bz\B', text)))