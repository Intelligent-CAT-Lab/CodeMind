music_string = ''
note_map = {'o': 4, 'o|': 2, '.|': 1}
print([note_map[x] for x in music_string.split(' ') if x])