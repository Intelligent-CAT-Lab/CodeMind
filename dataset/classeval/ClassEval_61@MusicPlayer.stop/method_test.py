def test(self):

        musicPlayer = MusicPlayer()
        musicPlayer.playlist = ["song1", "song2"]
        musicPlayer.current_song = "song2"
        return musicPlayer.stop()