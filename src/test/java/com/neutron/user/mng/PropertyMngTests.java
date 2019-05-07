package com.neutron.user.mng;

import com.neutron.user.UserApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {UserApplication.class})
public class PropertyMngTests {

    @Autowired
    private Properties properties;

    @Test
    public void testProperty() {
        Long mobile = properties.getMobile();
        Assert.assertEquals(18710152801L, mobile.longValue());
    }

}
