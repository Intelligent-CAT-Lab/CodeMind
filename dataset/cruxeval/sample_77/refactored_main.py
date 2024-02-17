text = 'h ,lpvvkohh,u'
character = 'i'
subject = text[text.rfind(character):]
print(subject*text.count(character))