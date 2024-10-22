
package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;

@ApplicationScoped
public class OtherUnitService {

    Logger log = org.slf4j.LoggerFactory.getLogger(OtherUnitService.class);

    public boolean someMethod() {
        log.info("tested using unit test");
        return true;
    }

}
