/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_wolfssl_wolfcrypt_ECC */

#ifndef _Included_com_wolfssl_wolfcrypt_ECC
#define _Included_com_wolfssl_wolfcrypt_ECC
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_wolfssl_wolfcrypt_ECC
 * Method:    doVerify
 * Signature: (Ljava/nio/ByteBuffer;JLjava/nio/ByteBuffer;JLjava/nio/ByteBuffer;J[I)I
 */
JNIEXPORT jint JNICALL Java_com_wolfssl_wolfcrypt_ECC_doVerify
  (JNIEnv *, jobject, jobject, jlong, jobject, jlong, jobject, jlong, jintArray);

/*
 * Class:     com_wolfssl_wolfcrypt_ECC
 * Method:    doSign
 * Signature: (Ljava/nio/ByteBuffer;JLjava/nio/ByteBuffer;[JLjava/nio/ByteBuffer;J)I
 */
JNIEXPORT jint JNICALL Java_com_wolfssl_wolfcrypt_ECC_doSign
  (JNIEnv *, jobject, jobject, jlong, jobject, jlongArray, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif
