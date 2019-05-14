package demo

import grails.rest.Resource
import groovy.transform.CompileStatic
import grails.plugin.springsecurity.annotation.Secured

@CompileStatic
@Resource(uri = '/api/vehicle')
@Secured(['ROLE_DRIVER'])
class Vehicle {

    String name

    Make make
    Model model

    static belongsTo = [driver: Driver]

    static constraints = {
    }
}
