/**
 * Copyright © 2019 Jesse Gallagher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.misc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

@SuppressWarnings("restriction")
public class BASE64Encoder extends CharacterEncoder {

	private final sun.misc.BASE64Encoder delegate = new sun.misc.BASE64Encoder();

	/**
	 * @return
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return delegate.hashCode();
	}

	/**
	 * @param obj
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		return delegate.equals(obj);
	}

	/**
	 * @param inStream
	 * @param outStream
	 * @throws IOException
	 * @see sun.misc.CharacterEncoder#encode(java.io.InputStream, java.io.OutputStream)
	 */
	public void encode(InputStream inStream, OutputStream outStream) throws IOException {
		delegate.encode(inStream, outStream);
	}

	/**
	 * @param aBuffer
	 * @param aStream
	 * @throws IOException
	 * @see sun.misc.CharacterEncoder#encode(byte[], java.io.OutputStream)
	 */
	public void encode(byte[] aBuffer, OutputStream aStream) throws IOException {
		delegate.encode(aBuffer, aStream);
	}

	/**
	 * @param aBuffer
	 * @return
	 * @see sun.misc.CharacterEncoder#encode(byte[])
	 */
	public String encode(byte[] aBuffer) {
		return delegate.encode(aBuffer);
	}

	/**
	 * @param aBuffer
	 * @param aStream
	 * @throws IOException
	 * @see sun.misc.CharacterEncoder#encode(java.nio.ByteBuffer, java.io.OutputStream)
	 */
	public void encode(ByteBuffer aBuffer, OutputStream aStream) throws IOException {
		delegate.encode(aBuffer, aStream);
	}

	/**
	 * @param aBuffer
	 * @return
	 * @see sun.misc.CharacterEncoder#encode(java.nio.ByteBuffer)
	 */
	public String encode(ByteBuffer aBuffer) {
		return delegate.encode(aBuffer);
	}

	/**
	 * @param inStream
	 * @param outStream
	 * @throws IOException
	 * @see sun.misc.CharacterEncoder#encodeBuffer(java.io.InputStream, java.io.OutputStream)
	 */
	public void encodeBuffer(InputStream inStream, OutputStream outStream) throws IOException {
		delegate.encodeBuffer(inStream, outStream);
	}

	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return delegate.toString();
	}

	/**
	 * @param aBuffer
	 * @param aStream
	 * @throws IOException
	 * @see sun.misc.CharacterEncoder#encodeBuffer(byte[], java.io.OutputStream)
	 */
	public void encodeBuffer(byte[] aBuffer, OutputStream aStream) throws IOException {
		delegate.encodeBuffer(aBuffer, aStream);
	}

	/**
	 * @param aBuffer
	 * @return
	 * @see sun.misc.CharacterEncoder#encodeBuffer(byte[])
	 */
	public String encodeBuffer(byte[] aBuffer) {
		return delegate.encodeBuffer(aBuffer);
	}

	/**
	 * @param aBuffer
	 * @param aStream
	 * @throws IOException
	 * @see sun.misc.CharacterEncoder#encodeBuffer(java.nio.ByteBuffer, java.io.OutputStream)
	 */
	public void encodeBuffer(ByteBuffer aBuffer, OutputStream aStream) throws IOException {
		delegate.encodeBuffer(aBuffer, aStream);
	}

	/**
	 * @param aBuffer
	 * @return
	 * @see sun.misc.CharacterEncoder#encodeBuffer(java.nio.ByteBuffer)
	 */
	public String encodeBuffer(ByteBuffer aBuffer) {
		return delegate.encodeBuffer(aBuffer);
	}
}
