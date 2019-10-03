package edu.erlin.pgdm

import edu.erlin.pgdm.utils.Constants

import java.time.LocalDateTime

class Status {

    String name
    String description

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "statuses"

        description sqlType: "text"
    }
}
