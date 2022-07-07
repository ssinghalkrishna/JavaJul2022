package support;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before //before each scenario
    public void start() {
        TestContext.initialize();
    }

    @After
    public void finish() {
        TestContext.teardown();
    }

}
