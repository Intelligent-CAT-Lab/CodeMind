def test(self):
        self.hotel = Hotel('Test Hotel', {'single': 3, 'double': 2})
        self.hotel.booked_rooms = {'single': {'guest 1': 2}, 'double': {'guest 2': 1}}
        self.hotel.check_out('triple', 2)
        return self.hotel.available_rooms,self.hotel.booked_rooms