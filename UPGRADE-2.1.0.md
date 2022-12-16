# Upgrading to Philadelphia Extras 2.1.0

Philadelphia Extras 2.1.0 contains a change in its Java module support.

Philadelphia Extras 2.1.0 introduces rudimentary Java module support by setting
module names fo all Philadelphia Extras libraries. These correspond to their
package names. For example, the module name for Philadelphia Coinbase is:
```
com.paritytrading.philadelphia.coinbase
```

If you use Java modules in your application and currently reference
Philadelphia Extras libraries using module names derived from their JAR names
(as the JDK does by default), start using module names that correspond to their
package names instead. See below for an example.

Before:
```java
module example {
    requires philadelphia.coinbase;
}
```

After:
```java
module example {
    requires com.paritytrading.philadelphia.coinbase;
}
```
