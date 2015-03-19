package ganja.common.http.exception

class NotFoundException extends RuntimeException {

    String statusCode = '404'

    NotFoundException(String message) {
        super(message)
    }
}
