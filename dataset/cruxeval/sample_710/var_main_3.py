def f(playlist, liker_name, song_index):
    playlist[liker_name] = playlist.get(liker_name, [])	## <state>playlist = CLRJ | liker_name = CLRJ</state>
    playlist[liker_name].append(song_index)	## <state>playlist = CLRJ | liker_name = CLRJ | song_index = CLRJ</state>
    return playlist	## <state>playlist = CLRJ</state>
