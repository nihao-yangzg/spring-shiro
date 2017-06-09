package backup.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="unauthorized")
public class UnauthorizedException extends RuntimeException{

	private static final long serialVersionUID = -2612088945838911496L;

}
