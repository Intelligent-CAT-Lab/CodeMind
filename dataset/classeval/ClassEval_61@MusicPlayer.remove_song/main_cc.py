import random
class MusicPlayer: 
    def __init__(self):
        """
        Initializes the music player with an empty playlist, no current song, and a default volume of 50.
        """
        self.playlist = []
        self.current_song = None
        self.volume = 50

    def remove_song(self, song):
        if song in self.playlist:
            self.playlist.remove(song)
            if self.current_song == song:
                self.stop()
    def play(self):
        if self.playlist and self.current_song:
            return self.playlist[0]
        elif len(self.playlist): 
            return False
    def stop(self):
        if self.current_song:
            self.current_song = None
            return True
        else:
            return False