def f(s):
    left, sep, right = s.rpartition('.')	## {"left" : '',"sep" : '',"right" : '',"s" : ''}
    new = sep.join([right, left])	## {"new" : '',"sep" : '',"right" : '',"left" : ''}
    _, sep, _ = new.rpartition('.')	## {"_" : '',"sep" : '',"new" : ''}
    return new.replace(sep, ', ')	## {"new" : '',"sep" : ''}
