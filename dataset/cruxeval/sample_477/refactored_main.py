text = '|xduaisf'
topic, sep, problem = text.rpartition('|')
if problem == 'r':
    problem = topic.replace('u', 'p')
print(topic, problem)