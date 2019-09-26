package edu.erlin.pgdm.security

class Permission {

    int code

    String name
    String description

    static mapping = {
        table "permissions"
    }
}
