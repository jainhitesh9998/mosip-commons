package io.mosip.authentication.core.dto.indauth;

import java.util.List;

import lombok.Data;

/**
 * Instantiates a new auth status info.
 */
@Data
public class AuthStatusInfo {

	/** The status. */
	private boolean status;

	/** The err. */
	private List<AuthError> err;
}
