/* MyRsaSignCallback.java
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

import java.io.*;
import java.net.*;
import java.nio.*;
import com.wolfssl.*;
import com.wolfssl.wolfcrypt.*;

class MyRsaSignCallback implements WolfSSLRsaSignCallback
{
    public int rsaSignCallback(WolfSSLSession ssl, ByteBuffer in, long inSz,
            ByteBuffer out, int[] outSz, ByteBuffer keyDer, long keySz,
            Object ctx) {

        System.out.println("---------- Entering MyRsaSignCallback ----------");
        int ret = -1;

        RSA rsa = new RSA();
        MyRsaSignCtx rsaSignCtx = (MyRsaSignCtx)ctx;

        ret = rsa.doSign(in, inSz, out, outSz, keyDer, keySz);
        if (ret != 0) {
            System.out.println("RSA sign failed in " +
                    "MyRsaSignCallback");
        }

        System.out.println("---------- Leaving MyRsaSignCallback ----------");
        return ret;
    }
}

