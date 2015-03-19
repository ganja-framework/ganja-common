package ganja.common.http.exception

import spock.lang.Specification

class AccessDeniedExceptionSpec extends Specification {

    void "it can be thrown"() {

        when:
        throw new AccessDeniedException('test message')

        then:
        AccessDeniedException exception = thrown()
        exception.getStatusCode() == '403'
        exception.getMessage() == 'test message'
    }
}
