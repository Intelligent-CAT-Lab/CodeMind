S = "Hello world"
import re
sentences = re.split(r'[.?!]\s*', S)
print(sum(sentence[0:2] == 'I ' for sentence in sentences))