package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyBean {
    // jacoco cover this class only using inject by @Inject
    // @Inject
    private final SomeBean someBean;

    // no cover by constructor
    public MyBean(SomeBean someBean) {
        this.someBean = someBean;
    }

    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}
