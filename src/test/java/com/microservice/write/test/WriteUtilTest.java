package com.microservice.write.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WriteUtilTest {

	@Test
	public void testSum() {
		int a = WriteUtil.sum(2, 3);
		assertEquals(5, a);

		a = WriteUtil.sum(2, 4);
		assertEquals(6, a);

		a = WriteUtil.sum(2, 5);
		assertEquals(7, a);
	}

	@Test
	public void testConcat() {
		String a = WriteUtil.concat("aaa", "bbb");
		assertEquals("aaabbb", a);

		a = WriteUtil.concat("bbb", "aaa");
		assertEquals("bbbaaa", a);

	}
}
