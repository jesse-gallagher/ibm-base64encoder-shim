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

class Util {
	static long copyStream(InputStream is, OutputStream os, int bufferSize) throws IOException {
		byte[] buffer = new byte[bufferSize];
		long totalBytes = 0;
		int readBytes;
		while( (readBytes = is.read(buffer))>0 ) {
			os.write(buffer, 0, readBytes);
			totalBytes += readBytes;
		}
		return totalBytes;
    }
}
