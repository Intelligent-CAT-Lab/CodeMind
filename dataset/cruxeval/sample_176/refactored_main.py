text = 'some text'
to_place = 'some'
after_place = text[:text.find(to_place, 0) + 1]
before_place = text[text.find(to_place, 0) + 1:]
print(after_place + before_place)