import re
def remove_parenthesis(items):
 for item in items:
    return (re.sub(r" ?\([^)]+\)", "", item))