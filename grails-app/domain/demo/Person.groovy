package demo

import grails.rest.Resource

@Resource(uri='/people', formats=['json'])


class Person {
    String name
    static hasMany  = [friends: Person]
    static belongsTo = [friend: Person]
}
