
package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;

@ApplicationScoped
public class OtherService {

    Logger log = org.slf4j.LoggerFactory.getLogger(OtherService.class);

    public boolean someMethod() {
        log.info("tested using component test");
        return true;
    }

}
