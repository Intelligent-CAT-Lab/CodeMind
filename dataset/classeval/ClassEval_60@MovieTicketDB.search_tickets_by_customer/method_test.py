def test(self):
        self.db_name = 'test_database.db'
        self.db = MovieTicketDB(self.db_name)
        self.db.insert_ticket('Avengers: Endgame', 'Cinema 1', 'A1', 'ddd')
        tickets = self.db.search_tickets_by_customer('ddd')
        ticket_id = tickets[0][0]
        self.db.delete_ticket(ticket_id)
        tickets = self.db.search_tickets_by_customer('ddd')
        return len(tickets),len(tickets)