# Philadelphia FTX

Philadelphia FTX implements connectivity to [FTX][].

  [FTX]: https://ftx.com/

## Features

Philadelphia FTX implements the following protocol:

- **FTX FIX API** (based on **FIX 4.2**)

See the [documentation][] at FTX for the protocol specification.

  [documentation]: https://docs.ftx.com/#fix-api

## Dependencies

Philadelphia FTX depends on the following libraries:

- Philadelphia Core 1.x
- Philadelphia FIX 4.2 1.x

If you do not already depend on Philadelphia Core 1.x and Philadelphia FIX 4.2
1.x in your application, add Maven dependencies to them. For example:

```xml
<dependency>
  <groupId>com.paritytrading.philadelphia</groupId>
  <artifactId>philadelphia-core</artifactId>
  <version>1.3.1</version>
</dependency>
<dependency>
  <groupId>com.paritytrading.philadelphia</groupId>
  <artifactId>philadelphia-fix42</artifactId>
  <version>1.3.1</version>
</dependency>
```

## Download

Add a Maven dependency to Philadelphia FTX:

```xml
<dependency>
  <groupId>com.paritytrading.philadelphia</groupId>
  <artifactId>philadelphia-ftx</artifactId>
  <version><!-- latest release --></version>
</dependency>
```

See the [latest release][] on GitHub.

  [latest release]: https://github.com/paritytrading/philadelphia-extras/releases/latest

## License

Released under the Apache License, Version 2.0.
