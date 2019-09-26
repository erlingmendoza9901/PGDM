package edu.erlin.pgdm.security

import edu.erlin.pgdm.model.enums.ParamValueType

class Param {

    int code

    String name
    String description

    String value
    ParamValueType paramValueType

    static mapping = {
        table "params"
    }
}
