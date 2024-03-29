package edu.erlin.pgdm

import edu.erlin.pgdm.utils.Constants

import java.time.LocalDateTime

class TicketType {

    String name
    String description
    double minCost
    double maxCost

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "ticket_types"

        description sqlType: "text"
    }
}
