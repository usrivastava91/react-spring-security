package demo

import grails.rest.Resource
import groovy.transform.CompileStatic
import grails.plugin.springsecurity.annotation.Secured

@CompileStatic
@Secured(['ROLE_DRIVER'])
@Resource(uri = '/api/model')
class Model {

    String name

    static constraints = {
    }
}
