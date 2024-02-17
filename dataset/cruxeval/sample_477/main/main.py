def f(text):
    topic, sep, problem = text.rpartition('|')
    if problem == 'r':
        problem = topic.replace('u', 'p')
    return topic, problem