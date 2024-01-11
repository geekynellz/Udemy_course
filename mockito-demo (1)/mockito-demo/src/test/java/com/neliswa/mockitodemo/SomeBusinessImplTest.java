package com.neliswa.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void findGreatestFromAllData_basicScenario() {
		DataServiceStub dataServiceStub = new DataServiceStub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(25, result);
	}

}
class DataServiceStub implements DataService{
	
	@Overide
	public int[] retrieveAllData () {
		return new int[]{25, 15, 5};
	}
	
}
