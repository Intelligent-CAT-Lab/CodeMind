import re
def find_adverb_position(text):
 for m in re.finditer(r"\w+ly", text):
    return (m.start(), m.end(), m.group(0))