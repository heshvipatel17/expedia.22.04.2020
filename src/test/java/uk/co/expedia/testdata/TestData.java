package uk.co.expedia.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        return new Object[][]{
                {"Abc1.gmail.com","test123"},
                {"Abc2.gmail.com","test123"},
                {"Abc3.gmail.com","test123"}

        };
    }

}


