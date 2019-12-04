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

public abstract class CharacterDecoder {
	public byte[] decodeBuffer(InputStream is) throws IOException {
		return null;
	}
	public void decodeBuffer(InputStream is, OutputStream os) throws IOException {
		
	}
	public byte[] decodeBuffer(String buffer) throws IOException {
		return null;
	}
	public ByteBuffer decodeBufferToByteBuffer(InputStream is) throws IOException {
		return null;
	}
	public ByteBuffer decodeBufferToByteBuffer(String buffer) throws IOException {
		return null;
	}
}
