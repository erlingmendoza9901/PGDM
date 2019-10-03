package edu.erlin.pgdm

import edu.erlin.pgdm.model.enums.WarrantType
import edu.erlin.pgdm.utils.Constants

import java.time.LocalDateTime

class Payment {

    LocalDateTime Date
    Ticket ticket
    PaymentType paymentType
    String Warrant
    WarrantType warrantType
    double Amount

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "payments"
    }
}
