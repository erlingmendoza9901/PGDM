package edu.erlin.pgdm

import edu.erlin.pgdm.security.BasicCategory
import edu.erlin.pgdm.security.BasicParam
import edu.erlin.pgdm.security.BasicPermission
import edu.erlin.pgdm.security.BasicUser

class BootStrap {

    private BasicCategory basicCategory = new BasicCategory()
    private BasicUser basicUser = new BasicUser()
    private BasicParam basicParam = new BasicParam()
    private BasicPermission basicPermission = new BasicPermission()

    def init = { servletContext ->
        basicUser.insert()
        basicParam.insert()
        basicPermission.insert()
        basicCategory.insert()
    }
    def destroy = {
    }
}
