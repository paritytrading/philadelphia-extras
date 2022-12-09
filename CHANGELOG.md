# Release Notes

## 2.1.0 (????-??-??)

- Specify Java module names (Jussi Virtanen)

  Introduce minimal Java module support by specifying module names for all
  libraries corresponding to their package names.

## 2.0.0 (2022-10-29)

- Remove Cboe FX support (Jussi Virtanen)

  The Cboe FX API documentation is no longer publicly available.

- Upgrade to Philadelphia 2.0.0 (Jussi Virtanen)

## 1.2.0 (2022-02-09)

- Clean up project documentation (Jussi Virtanen)

- Clean up Philadelphia Coinbase (Jussi Virtanen)

- Add Philadelphia FTX (Jussi Virtanen)

## 1.1.0 (2020-03-20)

See the [upgrade instructions](UPGRADE-1.1.0.md).

- Remove Philadelphia IEX (Jussi Virtanen)

- Update Philadelphia Coinbase (Jussi Virtanen)

  Add missing message types and tags.

- Clean up `CoinbaseTest` (Jan Nielsen)

- Remove transitive Philadelphia dependency (Jussi Virtanen)

  Replace the transitive Philadelphia 1.0.0 dependency with a Philadelphia
  1.x dependency. This makes it possible for applications to manage their
  Philadelphia 1.x and Philadelphia Coinbase dependencies independently.

## 1.0.0 (2018-09-03)

- Replace GDAX with Coinbase Pro and Coinbase Prime
- Upgrade to Philadelphia 1.0.0

## 0.5.0 (2017-10-21)

- Replace Hotspot with Cboe FX
- Upgrade to Cboe FX FIX Proxy 5.1.4

## 0.4.0 (2017-08-13)

- Upgrade to Philadelphia 0.6.0

## 0.3.0 (2017-02-23)

- Add GDAX FIX API
- Add Bats Hotspot FIX Proxy 4.0
- Upgrade to Philadelphia 0.5.0
- Improve documentation

## 0.2.0 (2016-03-30)

- Move to `com.paritytrading` namespace

## 0.1.0 (2016-03-16)

- Initial release
