# reproducer jacoco

```
# check we have 100% coverage (OK)
mvn clean verify
open target/jacoco-report/index.html

# check we have only 40% coverage (KO)
mvn clean verify -Dsurefire.argLine=-Xmx1g
open target/jacoco-report/index.html
```