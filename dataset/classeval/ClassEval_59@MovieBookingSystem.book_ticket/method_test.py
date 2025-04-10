def test(self):
        self.system = MovieBookingSystem()
        self.system.add_movie('Batman', 49.9, '17:05', '19:25', 3)
        self.system.book_ticket('Batman', [(0, 0)])
        result = self.system.book_ticket('Batman', [(0, 0)])
        return result,self.system.movies[0]['seats'][0][0]