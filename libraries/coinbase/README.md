# Philadelphia Coinbase

Philadelphia Coinbase implements connectivity to [Coinbase Pro][].

  [Coinbase Pro]: https://pro.coinbase.com

## Features

Philadelphia Coinbase implements the following protocol:

- **Coinbase Pro FIX API** (based on **FIX 4.2**)

See the [documentation][] at Coinbase Pro for the protocol specification.

  [documentation]: https://docs.pro.coinbase.com

## Dependencies

Philadelphia Coinbase depends on the following libraries:

- Philadelphia Core 2.x
- Philadelphia FIX 4.2 2.x

If you do not already depend on Philadelphia Core 2.x and Philadelphia FIX 4.2
2.x in your application, add Maven dependencies to them. For example:

```xml
<dependency>
  <groupId>com.paritytrading.philadelphia</groupId>
  <artifactId>philadelphia-core</artifactId>
  <version>2.0.0</version>
</dependency>
<dependency>
  <groupId>com.paritytrading.philadelphia</groupId>
  <artifactId>philadelphia-fix42</artifactId>
  <version>2.0.0</version>
</dependency>
```

## Download

Add a Maven dependency to Philadelphia Coinbase:

```xml
<dependency>
  <groupId>com.paritytrading.philadelphia</groupId>
  <artifactId>philadelphia-coinbase</artifactId>
  <version><!-- latest release --></version>
</dependency>
```

See the [latest release][] on GitHub.

  [latest release]: https://github.com/paritytrading/philadelphia-extras/releases/latest

## License

Released under the Apache License, Version 2.0.
