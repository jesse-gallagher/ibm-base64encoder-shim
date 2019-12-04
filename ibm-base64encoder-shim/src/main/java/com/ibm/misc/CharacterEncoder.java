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

public abstract class CharacterEncoder {
	public String encode(byte[] bytes) {
		return null;
	}
	
	public void encode(byte[] bytes, OutputStream os) throws IOException {
		
	}
	
	public void encode(InputStream is, OutputStream os) throws IOException {
		
	}
	
	public String encode(ByteBuffer buf) {
		return null;
	}
	
	public void encode(ByteBuffer buf, OutputStream os) throws IOException {
		
	}
	
	public String encodeBuffer(byte[] bytes) {
		return encode(bytes);
	}
	
	public void encodeBuffer(byte[] bytes, OutputStream os) throws IOException {
		encode(bytes, os);
	}
	
	public void encodeBuffer(InputStream is, OutputStream os) throws IOException {
		encode(is, os);
	}
	
	public String encodeBuffer(ByteBuffer buf) {
		return encodeBuffer(buf);
	}
	
	public void encodeBuffer(ByteBuffer buf, OutputStream os) throws IOException {
		encode(buf, os);
	}
}
