import random
class MusicPlayer: 
    def __init__(self):
        """
        Initializes the music player with an empty playlist, no current song, and a default volume of 50.
        """
        self.playlist = []
        self.current_song = None
        self.volume = 50

    def set_volume(self, volume):
        if 0 <= volume <= 100:
            self.volume = volume
        else:
            return False