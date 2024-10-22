
package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OtherUnitTest {
    @Test
    void someTest() {
        Assertions.assertTrue(new OtherUnitService().someMethod());
    }
}
