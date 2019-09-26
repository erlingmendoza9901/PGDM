package edu.erlin.pgdm.security

import java.time.LocalDate

class User {

    String firtsname
    String lastname

    LocalDate birthday

    String username
    String password

    String phone
    String email

    static hasMany = [permissions: Permission]

    static mapping = {
        table "users"
        username unique: true
        password length: 500
    }
}
