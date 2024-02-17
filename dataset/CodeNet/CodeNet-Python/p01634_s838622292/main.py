s=input()
print('INVALID' if s.isalpha() or s.isdigit() or s.islower() or s.isupper() or len(s)<6 else 'VALID')