package ganja.common.http.exception

class AccessDeniedException extends RuntimeException {

    String statusCode = '403'

    AccessDeniedException(String message) {
        super(message)
    }
}
