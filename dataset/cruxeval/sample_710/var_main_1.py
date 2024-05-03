def f(playlist, liker_name, song_index):
    playlist[liker_name] = playlist.get(liker_name, [])	## playlist = CLRJ | liker_name = CLRJ
    playlist[liker_name].append(song_index)	## playlist = CLRJ | liker_name = CLRJ | song_index = CLRJ
    return playlist	## playlist = CLRJ
