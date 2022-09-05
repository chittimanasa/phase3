package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserAuthenticationTest {
	private UserAuthentication userA;
	@BeforeEach
	public void setup() {
		userA=new UserAuthentication();
		System.out.println("Object initialized");
	}
	@Test
	public void verifyUserName() {
		assertEquals(userA.getUserName(), "manasa");
	}
	@Test
	public void verifyEmail() {
		assertEquals(userA.getEmail(), "manasachitti@gmail.com");
	}
	@Test
	public void verifyPhnNum() {
		assertEquals(userA.getPhnNum(), 949312788);
	}
	@Test
	public void verifyPassword() {
		assertEquals(userA.getPassword(), "manu@123");
	}
	@AfterEach
	public void tearDown() {
		userA=null;
		System.out.println("Object destroyed");
	}
}