text = 'Rjug nzufE'
t = list(text)
t.pop(len(t) // 2)
t.append(text.lower())
print(':'.join([c for c in t]))