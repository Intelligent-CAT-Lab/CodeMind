def f(playlist, liker_name, song_index):
    playlist[liker_name] = playlist.get(liker_name, [])
    playlist[liker_name].append(song_index)
    return playlist