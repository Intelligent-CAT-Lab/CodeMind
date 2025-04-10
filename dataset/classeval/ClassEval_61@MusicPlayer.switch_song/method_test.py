def test(self):

        musicPlayer = MusicPlayer()
        musicPlayer.playlist = ["song1", "song2", "song3"]
        musicPlayer.current_song = "song3"
        return musicPlayer.switch_song()