package com.example.eurekademo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EurekaDemoApplication.class)
@WebAppConfiguration
@AutoConfigureMockMvc
public class EurekaDemoApplicationTests {
    @Autowired
    private EurekaDemoApplication app;

	@Test
	public void contextLoads() {
	}

	@Test
    public void testAdd(){
	    int res = app.add(2,4);
	    assert(res==6);
    }
}
