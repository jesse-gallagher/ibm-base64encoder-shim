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
public class BASE64Decoder extends CharacterDecoder {
	
	private final sun.misc.BASE64Decoder delegate = new sun.misc.BASE64Decoder();

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
	 * @param aStream
	 * @param bStream
	 * @throws IOException
	 * @see sun.misc.CharacterDecoder#decodeBuffer(java.io.InputStream, java.io.OutputStream)
	 */
	public void decodeBuffer(InputStream aStream, OutputStream bStream) throws IOException {
		delegate.decodeBuffer(aStream, bStream);
	}

	/**
	 * @param inputString
	 * @return
	 * @throws IOException
	 * @see sun.misc.CharacterDecoder#decodeBuffer(java.lang.String)
	 */
	public byte[] decodeBuffer(String inputString) throws IOException {
		return delegate.decodeBuffer(inputString);
	}

	/**
	 * @param in
	 * @return
	 * @throws IOException
	 * @see sun.misc.CharacterDecoder#decodeBuffer(java.io.InputStream)
	 */
	public byte[] decodeBuffer(InputStream in) throws IOException {
		return delegate.decodeBuffer(in);
	}

	/**
	 * @param inputString
	 * @return
	 * @throws IOException
	 * @see sun.misc.CharacterDecoder#decodeBufferToByteBuffer(java.lang.String)
	 */
	public ByteBuffer decodeBufferToByteBuffer(String inputString) throws IOException {
		return delegate.decodeBufferToByteBuffer(inputString);
	}

	/**
	 * @param in
	 * @return
	 * @throws IOException
	 * @see sun.misc.CharacterDecoder#decodeBufferToByteBuffer(java.io.InputStream)
	 */
	public ByteBuffer decodeBufferToByteBuffer(InputStream in) throws IOException {
		return delegate.decodeBufferToByteBuffer(in);
	}

	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return delegate.toString();
	}
}
