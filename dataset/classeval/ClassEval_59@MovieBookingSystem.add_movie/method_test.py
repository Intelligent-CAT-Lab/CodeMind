def test(self):
        self.system = MovieBookingSystem()
        self.system.add_movie('Batman', 29.9, '17:05', '19:25', 3)
        return len(self.system.movies),self.system.movies[0]['name'],self.system.movies[0]['price'],self.system.movies[0]['start_time'],datetime.strptime('17:05', '%H:%M'),self.system.movies[0]['end_time'],datetime.strptime('19:25', '%H:%M'),self.system.movies[0]['seats'].shape