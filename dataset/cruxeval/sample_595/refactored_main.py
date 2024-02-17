text = 'qdhstudentamxupuihbuztn'
prefix = 'jdm'
if text.startswith(prefix):
    text = text.removeprefix(prefix)
text = text.capitalize()
print(text)