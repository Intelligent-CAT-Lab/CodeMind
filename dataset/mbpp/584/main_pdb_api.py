import re
def find_adverbs(text):
  for m in re.finditer(r"\w+ly", text):
    return ('%d-%d: %s' % (m.start(), m.end(), m.group(0)))
find_adverbs("Clearly, he has no excuse for such behavior.")