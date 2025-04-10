def test(self):

        musicPlayer = MusicPlayer()
        musicPlayer.playlist = ["song1", "song2"]
        musicPlayer.current_song = "song3"
        return musicPlayer.play()