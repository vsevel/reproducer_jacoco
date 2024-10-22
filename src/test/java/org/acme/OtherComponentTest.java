
package org.acme;

import io.quarkus.test.component.QuarkusComponentTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusComponentTest
public class OtherComponentTest {

    @Inject
    OtherService greetingService;

    @Test
    void someTest() {
        Assertions.assertTrue(greetingService.someMethod());
    }
}
