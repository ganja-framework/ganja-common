package ganja.common.http.exception

import spock.lang.Specification

class NotFoundExceptionSpec extends Specification {

    void "it can be thrown"() {

        when:
        throw new NotFoundException('resource not found')

        then:
        NotFoundException exception = thrown()
        exception.getStatusCode() == '404'
        exception.getMessage() == 'resource not found'
    }
}
