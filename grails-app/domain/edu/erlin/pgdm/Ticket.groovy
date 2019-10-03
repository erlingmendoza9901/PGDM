package edu.erlin.pgdm

import java.time.LocalDateTime

class Ticket {

    String warrant
    String warrantType
    LocalDateTime date
    String TicketType
    Double amount
    String status


    static mapping = {
        table "tickets"
    }
}
