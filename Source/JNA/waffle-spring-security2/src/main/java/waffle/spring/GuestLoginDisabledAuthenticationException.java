/**
 * Waffle (https://github.com/dblock/waffle)
 *
 * Copyright (c) 2010 - 2015 Application Security, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Application Security, Inc.
 */
package waffle.spring;

import org.springframework.security.AuthenticationException;

/**
 * Guest login is disabled authentication exception.
 * 
 * @author dblock[at]dblock[dot]org
 */
public class GuestLoginDisabledAuthenticationException extends AuthenticationException {

    private static final long serialVersionUID = 1L;

    public GuestLoginDisabledAuthenticationException(final String msg) {
        super(msg);
    }
}
