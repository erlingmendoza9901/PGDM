package edu.erlin.pgdm

import edu.erlin.pgdm.model.enums.WarrantType
import edu.erlin.pgdm.utils.Constants

import java.time.LocalDateTime

class Payment {

    String description

    LocalDateTime date
    Ticket ticket
    PaymentType paymentType
    String warrant
    WarrantType warrantType = WarrantType.NONE
    double amount

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "payments"
        description sqlType: "text"
    }
}
