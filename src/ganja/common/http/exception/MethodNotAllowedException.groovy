package ganja.common.http.exception

class MethodNotAllowedException extends RuntimeException {

    String statusCode = '405'

    MethodNotAllowedException(String message) {
        super(message)
    }
}
