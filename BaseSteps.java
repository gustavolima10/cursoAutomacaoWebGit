package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps {

    @Before
    public void abreNavegador(){
        Driver.abreNavegdor();
    }

    @After
    public void fechaNavegador(){
        Driver.fechaNavegador();
    }
}
