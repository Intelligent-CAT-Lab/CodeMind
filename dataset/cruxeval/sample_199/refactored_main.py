str = 'mnmnj krupa...##!@#!@#$$@##'
char = '@'
base = char * (str.count(char) + 1)
print(str.removesuffix(base))