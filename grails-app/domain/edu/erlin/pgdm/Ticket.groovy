package edu.erlin.pgdm

import edu.erlin.pgdm.model.enums.WarrantType
import edu.erlin.pgdm.utils.Constants

import java.time.LocalDateTime

class Ticket {

    String description
    String warrant
    WarrantType warrantType = WarrantType.NONE
    LocalDateTime date
    TicketType ticketType
    double amount
    Status status

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static mapping = {
        table "tickets"

        description sqlType: "text"
    }
}
