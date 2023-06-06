package com.chinatelecom;

import org.junit.Assert;
import org.junit.Test;

public class DeoTest {
    @Test
    public void testSay(){
        Demo d = new Demo();
        String ret = d.say("Soviet Union!");
        Assert.assertEquals("Hello Soviet Union!", ret);
    }
}
