import re
def remove_parenthesis(items):
 for item in items:
    return (re.sub(r" ?\([^)]+\)", "", item))
remove_parenthesis(["python (chrome)"])