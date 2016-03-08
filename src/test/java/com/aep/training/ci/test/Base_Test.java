package com.aep.training.ci.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aep.training.ci.model.Member;

public class Base_Test {
	
	private Member member;
	@Before
	public void setup() {
		member = new Member(1004,"1245655998", "H�seyin", "KILI�","C124DT");
	}
	
	@Test
	public void testMemberToString() {
		assertEquals("Member(memberId=1245655998, firstName=H�seyin, lastName=KILI�, pnr=C124DT)", member.toString());
	}
}
