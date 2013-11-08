/* WolfSSLRsaEncCallback.java
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

import java.nio.ByteBuffer;

/**
 * wolfSSL RSA Public Encrypt Callback Interface.
 * This interface specifies how applicaitons should implement the RSA public
 * encrypt callback class to be used by wolfSSL.
 * <p>
 * After implementing this interface, it should be passed as a parameter
 * to the {@link WolfSSLContext#setRsaEncCb(WolfSSLRsaEncCallback) 
 * WolfSSLContext.setRsaEncCb()} method to be registered with the native
 * wolfSSL library.
 *
 * @author  wolfSSL
 * @version 1.0, August 2013
 */
public interface WolfSSLRsaEncCallback {

    /**
     * RSA public encrypt callback method.
     * This method acts as RSA public enrypt callback.
     *
     * @param ssl       the current SSL session object from which the
     *                  callback was initiated.
     * @param in        input buffer to encrypt
     * @param inSz      length of the input, <b>in</b>
     * @param out       output buffer where the result of encryption should
     *                  be stored.
     * @param outSz     input/output variable that specifies the size of the
     *                  output buffer upon invocation. The actual size of
     *                  the encryption should be stored here before
     *                  returning. Use the first element of the array
     *                  for storage.
     * @param keyDer    RSA Public key in ASN1 format
     * @param keySz     length of the key, <b>keyDer</b>, in bytes
     * @param ctx       custom user-registered ECC signing context
     * @return          <b><code>0</code></b> upon success,
     *                  otherwise a negative value on error.
     */
    public int rsaEncCallback(WolfSSLSession ssl, ByteBuffer in, long inSz,
            ByteBuffer out, int[] outSz, ByteBuffer keyDer, long keySz,
            Object ctx);
}

