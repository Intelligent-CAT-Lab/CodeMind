def test(self):

        musicPlayer = MusicPlayer()
        musicPlayer.playlist = ["song1", "song2", "song3", "song4", "song5"]
        musicPlayer.remove_song("song1")
        return musicPlayer.playlist