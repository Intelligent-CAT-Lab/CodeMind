def extract_string(str, l):
    result = [e for e in str if len(e) == l] 
    return result
extract_string(['Python', 'list', 'exercises', 'practice', 'solution'] ,8)