text = 'ilfdoirwirmtoibsac'
for p in ['acs', 'asp', 'scn']:
    text = text.removeprefix(p) + ' '
print(text.removeprefix(' ')[:-1])