text = 'omeunhwpvr.dq'
pref = 'omeunh'
if text.startswith(pref):
    n = len(pref)
    text = '.'.join(text[n:].split('.')[1:] + text[:n].split('.')[:-1])
print(text)