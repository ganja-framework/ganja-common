package ganja.common.http.exception

import spock.lang.Specification

class UnauthorizedExceptionSpec extends Specification {

    void "it can be thrown"() {

        when:
        throw new UnauthorizedException('You are not authorize do to access this resource, please log in')

        then:
        UnauthorizedException exception = thrown()
        exception.getStatusCode() == '401'
        exception.getMessage() == 'You are not authorize do to access this resource, please log in'
    }
}
