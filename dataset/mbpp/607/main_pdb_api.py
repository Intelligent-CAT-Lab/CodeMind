import re

def find_literals(text, pattern):
  match = re.search(pattern, text)
  s = match.start()
  e = match.end()
  return (match.re.pattern, s, e)
find_literals('The quick brown fox jumps over the lazy dog.', 'fox')