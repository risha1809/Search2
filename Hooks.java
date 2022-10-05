package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends ComFunc {
@Before
    public void open(){

        openbrowser();
    }

    @After
    public void close(){
        closebrowser();
    }
}
