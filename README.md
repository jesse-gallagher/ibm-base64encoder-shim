# IBM BASE64* Shim

This project is a small shim to adapt `com.ibm.misc.BASE64Encoder` and `com.ibm.misc.BASE64Decoder` (as present in J9 JVMs) to their `sun.misc` equivalents.

Since the `sun.misc` classes are also not intended to be public, the best solution is still to move to the `java.util.Base64` class introduced in Java 8 (which has slightly-different semantics), but this JAR may be useful for old codebases.

See [my blog entry from November 2019](https://frostillic.us/blog/posts/2019/11/14/quick-tip-thursday-avoid-future-base64-trouble-in-java) for more details.

## License

The code in the project is licensed under the Apache License 2.0. The dependencies in the binary distribution are licensed under compatible licenses - see NOTICE for details.
