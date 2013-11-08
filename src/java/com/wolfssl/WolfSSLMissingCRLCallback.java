/* WolfSSLMissingCRLCallback.java
 *
 * Copyright (C) 2006-2013 wolfSSL Inc.
 *
 * This file is part of CyaSSL.
 *
 * CyaSSL is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * CyaSSL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA
 */

package com.wolfssl;

/**
 * wolfSSL Missing CRL Callback Interface.
 * This interface specifies how applicaitons should implement the missing
 * CRL callback class to be called by wolfSSL when CRL lookup fails.
 * <p>
 * After implementing this interface, it should be passed as a parameter
 * to either the {@link WolfSSLSession#setCRLCb(long, WolfSSLMissingCRLCallback) 
 * WolfSSLSession.setCRLCb()} method or {@link WolfSSLContext#setCRLCb(long,
 * WolfSSLMissingCRLCallback) WolfSSLContext.setCRLCb()} method, to be 
 * registered with the native wolfSSL library.
 *
 * @author  wolfSSL
 * @version 1.0, August 2013
 */
public interface WolfSSLMissingCRLCallback {

    /**
     * Missing CRL callback method.
     * This method provides the callback to be used when CRL lookup
     * failed during certificate verification.
     *
     * @param url   URL of the CRL which failed to verify during the
     *              certificate verification process.
     */
    public void missingCRLCallback(String url);
}

