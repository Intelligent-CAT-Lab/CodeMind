def test(self):

        musicPlayer = MusicPlayer()
        musicPlayer.playlist = ["song1", "song2", "song3"]
        return musicPlayer.previous_song()