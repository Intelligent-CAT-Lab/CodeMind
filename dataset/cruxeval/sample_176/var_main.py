def f(text, to_place):
    after_place = text[:text.find(to_place, 0) + 1]	## {"after_place" : '',"text" : '',"to_place" : ''}
    before_place = text[text.find(to_place, 0) + 1:]	## {"before_place" : '',"text" : '',"to_place" : ''}
    return after_place + before_place	## {"after_place" : '',"before_place" : ''}
