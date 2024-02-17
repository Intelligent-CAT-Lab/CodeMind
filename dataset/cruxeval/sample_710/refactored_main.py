playlist = {'aki': ['1', '5']}
liker_name = 'aki'
song_index = '2'
playlist[liker_name] = playlist.get(liker_name, [])
playlist[liker_name].append(song_index)
print(playlist)