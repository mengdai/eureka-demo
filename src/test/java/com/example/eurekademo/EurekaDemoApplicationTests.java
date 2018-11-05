package com.example.eurekademo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EurekaDemoApplication.class)
@WebAppConfiguration
@AutoConfigureMockMvc
public class EurekaDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
