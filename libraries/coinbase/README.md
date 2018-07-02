# Philadelphia Coinbase

Philadelphia Coinbase implements connectivity to [Coinbase Pro][] and
[Coinbase Prime][].

  [Coinbase Pro]:   https://pro.coinbase.com
  [Coinbase Prime]: https://prime.coinbase.com

## Features

Philadelphia Coinbase implements the following protocols:

- **Coinbase Pro FIX API** (based on **FIX 4.2**)
- **Coinbase Prime FIX API** (based on **FIX 4.2**)

See the developer documentation at [Coinbase Pro][Pro API] and [Coinbase
Prime][Prime API] for the protocol specifications.

  [Pro API]:   https://docs.pro.coinbase.com
  [Prime API]: https://docs.prime.coinbase.com

## Dependencies

Philadelphia Coinbase depends on the following libraries:

- Philadelphia Core 0.7.0
- Philadelphia FIX 4.2 0.7.0

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
