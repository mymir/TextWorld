package map;

import static org.junit.Assert.*;

import org.junit.Test;

public class MapTest {

	@Test
	public void testMap() {
		Map map = new Map();
		String stringMap = null;
		try {
			map.setMap("maps/two_rooms.txt");
			stringMap = map.printMap(); 
			assertEquals("[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#] | ------------------------------------------------------------ | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][o]   [#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#]      [#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#]      [#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#]      [#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#]      [#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#]                        [#][#]       ?       [#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#][#][#][#][#][#]      [#][#]_______________[#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#][#][#][#][#][#]          |     x          [#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#][#][#][#][#][#]          |     x          [#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#][#][#][#][#][#]      [#][#]               [#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#][#][#][#][#][#]      [#][#][#][#][#][#][#][#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#][#][#][#][#][#]      [#][#][#][#][#][#][#][#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#][#][#][#][#][#]______[#][#][#][#][#][#][#][#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#]                                          [#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#]                                          [#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#]                                              |     | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#]    x        x           x        x           |     | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#]__________________________________________[#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#]                   ?                      [#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | [#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#] | [#][#][#][#]\n" + 
					"[#][#][#][#] | ------------------------------------------------------------ | [#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]",stringMap);
		} catch (IllegalArgumentException e) {
			fail();
		}
		
		try {
			map.setMap("maps/bridge_map.txt");
			stringMap = map.printMap(); 
			assertEquals("[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][o]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#]                        [#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#]       x          [#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#][#] x    [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
					"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]",stringMap);
		} catch (IllegalArgumentException e) {
			fail();
		}
		
		try {
			map.setMap("maps/map.txt"); 
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid file.",e.getMessage());
		} 
		
		map.goRight();
		try {
			stringMap = map.printMap(); 
		} catch (IllegalArgumentException e) {
			fail();
		} 
		
		assertEquals("[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [o][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#]                        [#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#]       x          [#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#] x    [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]", stringMap);
		
		map.goRight();
		try {
			stringMap = map.printMap(); 
		} catch (IllegalArgumentException e) {
			fail();
		} 
		
		assertEquals("[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [o][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#]                        [#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#]       x          [#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#] x    [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]", stringMap);
		
		map.goLeft();
		try {
			stringMap = map.printMap(); 
		} catch (IllegalArgumentException e) {
			fail();
		} 
		
		assertEquals("[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][o]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#]                        [#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#]       x          [#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#] x    [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]", stringMap);
		
		map.goDown();
		try {
			stringMap = map.printMap(); 
		} catch (IllegalArgumentException e) {
			fail();
		} 
		
		assertEquals("[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#]         [o]            [#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#]       x          [#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#] x    [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]", stringMap);
		
		map.goRight();
		try {
			stringMap = map.printMap(); 
		} catch (IllegalArgumentException e) {
			fail();
		} 
		
		assertEquals("[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#]            [o]         [#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#]       x          [#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#] x    [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]", stringMap);
		
		map.goDown();
		try {
			stringMap = map.printMap(); 
		} catch (IllegalArgumentException e) {
			fail();
		} 
		
		assertEquals("[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#]                        [#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#]       x [o]      [#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#] x    [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]", stringMap);
		
		map.goUp();
		try {
			stringMap = map.printMap(); 
		} catch (IllegalArgumentException e) {
			fail();
		} 
		
		assertEquals("[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#]            [o]         [#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#]       x          [#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#]      [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]   [#][#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#] x    [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#][#]   [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#] | [#][#][#][#]      [#][#][#][#] | [#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#]------------------------------------[#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]\n" + 
				"[#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#][#]", stringMap);
	}

}
