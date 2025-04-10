import random
class MusicPlayer: 
    def __init__(self):
        """
        Initializes the music player with an empty playlist, no current song, and a default volume of 50.
        """
        self.playlist = []
        self.current_song = None
        self.volume = 50

    def stop(self):
        if self.current_song:
            self.current_song = None
            return True
        else:
            return False