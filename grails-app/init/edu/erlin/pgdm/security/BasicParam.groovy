package edu.erlin.pgdm.security

import edu.erlin.pgdm.model.enums.ParamValueType
import edu.erlin.pgdm.model.interfaces.BootStrapInsert

class BasicParam implements BootStrapInsert {

    BasicParam() {
    }

    @Override
    void insert() {
        create(0, "TEST", "", "TRUE", ParamValueType.BOOLEAN)
    }

    private Param create(int code, String name, String description, String value, ParamValueType paramValueType) {
        Param param = Param.findByCode(code)
        if (param == null) {
            param = new Param()
            param.code = code
            param.name = name
            param.description = description
            param.value = value
            param.paramValueType = paramValueType
            return param.save(flush: true)
        }
        return param
    }
}
