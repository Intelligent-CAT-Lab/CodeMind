def test(self):
        self.hotel = Hotel('peace hotel', {'single': 3, 'double': 2})
        result = self.hotel.book_room('single', 2, 'guest 1')
        return result,self.hotel.booked_rooms,self.hotel.available_rooms