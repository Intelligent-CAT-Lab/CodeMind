def f(text, to_place):
    after_place = text[:text.find(to_place, 0) + 1]
    before_place = text[text.find(to_place, 0) + 1:]
    return after_place + before_place