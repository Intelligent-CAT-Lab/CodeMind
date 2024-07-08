from typing import *	##line:(1)
def parse_music(music_string: str) -> List[int]:	##line:(2)
    note_map = {'o': 4, 'o|': 2, '.|': 1}	##line:(3)
    return [note_map[x] for x in music_string.split(' ') if x]	##line:(4)

parse_music('') 