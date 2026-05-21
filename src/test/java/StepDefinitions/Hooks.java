package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {

    @After // her senaryodan sonra çalışır
    public void after(){
        GWD.quitDriver();
    }
}
