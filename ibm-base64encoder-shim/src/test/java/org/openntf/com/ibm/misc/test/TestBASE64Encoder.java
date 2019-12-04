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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

import com.ibm.misc.BASE64Decoder;

@SuppressWarnings("nls")
class TestBASE64Encoder {

	@Test
	void testEncoder() throws IOException {
		String base64 = "bG9uZ2VyIHRlc3Q=";
		byte[] bytes = "longer test".getBytes();
		
		BASE64Decoder dec = new BASE64Decoder();
		
		assertArrayEquals(bytes, dec.decodeBuffer(base64));
		try(InputStream is = new ByteArrayInputStream(base64.getBytes())) {
			assertArrayEquals(bytes, dec.decodeBuffer(is));
		}
		try(ByteArrayOutputStream os = new ByteArrayOutputStream()) {
			try(InputStream is = new ByteArrayInputStream(base64.getBytes())) {
				dec.decodeBuffer(is, os);
			}
			assertArrayEquals(bytes, os.toByteArray());
		}
		
		try(InputStream is = new ByteArrayInputStream(base64.getBytes())) {
			assertArrayEquals(bytes, dec.decodeBufferToByteBuffer(is).array());
		}
		assertArrayEquals(bytes, dec.decodeBufferToByteBuffer(base64).array());
	}
	
	

}
