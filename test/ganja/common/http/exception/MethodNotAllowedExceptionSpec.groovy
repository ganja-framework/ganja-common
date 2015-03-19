package ganja.common.http.exception

import spock.lang.Specification

class MethodNotAllowedExceptionSpec extends Specification {

    void "it can be thrown"() {

        when:
        throw new MethodNotAllowedException('this method is not allowed')

        then:
        MethodNotAllowedException exception = thrown()
        exception.getStatusCode() == '405'
        exception.getMessage() == 'this method is not allowed'
    }
}
