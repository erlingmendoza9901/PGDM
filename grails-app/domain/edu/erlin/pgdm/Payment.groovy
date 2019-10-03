package edu.erlin.pgdm

import java.time.LocalDateTime

class Payment {

    LocalDateTime Date
    String ticket
    String PaymentType
    String Warrant
    String warrantType
    Double Amount


    static constraints = {
        table "payments"
    }
}
