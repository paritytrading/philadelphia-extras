# Upgrading to Philadelphia Extras 1.1.0

Philadelphia Extras 1.1.0 contains a change in its dependency management.

Philadelphia Coinbase 1.1.0 replaces the transitive Philadelphia 1.0.0
dependencies with Philadelphia 1.x dependencies. This makes it possible for
applications to manage their Philadelphia 1.x and Philadelphia Coinbase
dependencies independently.

If you do not already depend on Philadelphia Core 1.x and Philadelphia FIX 4.2
1.x in your application, add Maven dependencies to them. For example:

```xml
<dependency>
  <groupId>com.paritytrading.philadelphia</groupId>
  <artifactId>philadelphia-core</artifactId>
  <version>1.2.0</version>
</dependency>
<dependency>
  <groupId>com.paritytrading.philadelphia</groupId>
  <artifactId>philadelphia-fix42</artifactId>
  <version>1.2.0</version>
</dependency>
```
