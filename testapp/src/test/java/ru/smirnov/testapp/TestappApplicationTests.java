package ru.smirnov.testapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestappApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("contextLoads() test...");
		System.out.println("2 + 3 = 5: " + (2 + 3 == 5));
		System.out.println("contextLoads() test is finished");
	}

}
