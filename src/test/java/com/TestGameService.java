package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestGameService {
	@Test
	public void testGame() {
		GameService gs = new GameService();
		System.out.println("game");
		Assertions.assertEquals(gs.sayHello(), "game");
	}
}
