import re
text = "Clearly, he has no excuse for such behavior."
for m in re.finditer(r"\w+ly", text):
  print ('%d-%d: %s' % (m.start(), m.end(), m.group(0)))