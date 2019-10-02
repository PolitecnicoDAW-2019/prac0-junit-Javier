package PRAC1_ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class teamtest extends Team {
	public teamtest() throws Exception {
		super();
		
	}
	Team tester = new Team();
	Team tester2 = new Team("Della FC","Dellafuente FC","./La/ruta","El chino","LA TI GO",900,2000,2012);
	@Test
	public void testGetShortName() throws Exception {
		assertEquals(0,tester.getShortName(),"Default");
		assertEquals(0,tester2.getShortName(),"Della FC");
	};
	public void testGetLongName() throws Exception {
		assertEquals(0,tester.getLongName(),"Team Default");
		assertEquals(0,tester2.getLongName(),"Dellafuente FC");
	};
	public void testGetImgSrc() throws Exception {
		assertEquals(0,tester.getImageSrc(),"./");
		assertEquals(0,tester2.getImageSrc(),"./La/ruta");
	};
	public void testGetPresident() throws Exception {
		assertEquals(0,tester.getPresident(),"Dummy");
		assertEquals(0,tester2.getPresident(),"El chino");
	};
	public void testGetSPonsor() throws Exception {
		assertEquals(0,tester.getSponsor(),"UOC");
		assertEquals(0,tester2.getSponsor(),"LA TI GO");
	};
	public void testGetMembers() throws Exception {
		assertEquals(0,tester.getMembers(),1000);
		assertEquals(0,tester2.getMembers(),900);
	};
	public void testGetBudget() throws Exception {
		assertEquals(0,tester.getBudget(),1000000);
		assertEquals(0,tester2.getBudget(),2000);
	};
	public void testGetFounded() throws Exception {
		assertEquals(0,tester.getFounded(),2019);
		assertEquals(0,tester.getFounded(),2012);
	};
	
	public void testSetShortName() throws Exception {

	};

};
