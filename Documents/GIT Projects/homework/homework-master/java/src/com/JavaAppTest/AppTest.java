package com.JavaAppTest;

import com.JavaApp.App;
import org.junit.Assert;
import org.junit.Test;


import java.io.IOException;

/**
 * Unit test for simple App.*/


public class AppTest 
{
/*
*
     * Rigorous Test :-)

*/

    App app = new App();
    @Test
    public void responseCodeForMDSuccessful() throws IOException
    {
    app.sendRequestMDwithGSON();
        //app.sendRequestMDwithHTTP();
    }
}
