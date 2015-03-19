package ganja.common.http.exception

class UnauthorizedException extends RuntimeException {

    String statusCode = '401'

    UnauthorizedException(String message) {
        super(message)
    }
}
