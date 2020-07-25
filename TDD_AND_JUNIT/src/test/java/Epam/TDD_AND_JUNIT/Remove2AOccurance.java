package Epam.TDD_AND_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove2AOccurance {
	
	RemoveAs removeAs;
	
	@BeforeEach
void setup()
{
		removeAs=new RemoveAs();
}
	
	
	@Test
	void test() {
		assertEquals("BCD",removeAs.remA("ABCD"));
	}
	
	
	
	@Test
	void test1() {
		assertEquals("CD",removeAs.remA("AACD"));
	}
	
	
	@Test
	void test2() {
		assertEquals("BCD",removeAs.remA("BACD"));
	}
	
	
	@Test
	void test3() {
		assertEquals("",removeAs.remA("AA"));
	}
	
	
	

}
