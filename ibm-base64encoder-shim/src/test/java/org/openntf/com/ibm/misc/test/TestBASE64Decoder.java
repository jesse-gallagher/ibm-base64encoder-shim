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
package org.openntf.com.ibm.misc.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import org.junit.jupiter.api.Test;

import com.ibm.misc.BASE64Encoder;

@SuppressWarnings("nls")
class TestBASE64Decoder {

	@Test
	void testDecoder() throws IOException {
		String expected = "bG9uZ2VyIHRlc3Q=";
		byte[] bytes = "longer test".getBytes();
		
		BASE64Encoder enc = new BASE64Encoder();
		
		assertEquals(expected, enc.encode(bytes));
		assertEquals(expected, enc.encode(ByteBuffer.wrap(bytes)));
		
		try(ByteArrayOutputStream os = new ByteArrayOutputStream()) {
			enc.encode(bytes, os);
			os.flush();
			assertEquals(expected, os.toString());
		}
		
		try(InputStream is = new ByteArrayInputStream(bytes)) {
			try(ByteArrayOutputStream os = new ByteArrayOutputStream()) {
				enc.encode(is, os);
				os.flush();
				assertEquals(expected, new String(os.toByteArray()));
			}
		}
		
		try(ByteArrayOutputStream os = new ByteArrayOutputStream()) {
			enc.encode(ByteBuffer.wrap(bytes), os);
			os.flush();
			assertEquals(expected, new String(os.toByteArray()));
		}
	}
	
	

}
