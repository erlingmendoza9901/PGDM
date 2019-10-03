package edu.erlin.pgdm.security

import edu.erlin.pgdm.model.enums.ParamValueType
import edu.erlin.pgdm.utils.Constants

import java.time.LocalDateTime

class Param {

    int code

    String name
    String description

    String value
    ParamValueType paramValueType

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static mapping = {
        table "params"
    }
}
