from typing import *
def parse_music(music_string: str) -> List[int]:
    note_map = {'o': 4, 'o|': 2, '.|': 1}
    return [note_map[x] for x in music_string.split(' ') if x]

output = parse_music('') 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_17/output.txt", 'w')
file.write(str(output))
file.close()
    