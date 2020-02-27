package com.cg.ddelight.dao;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.cg.ddelight.main.ProductStock;

public class Test {
private static DataBaseDao dbs;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dbs=new DataBaseDao();
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@org.junit.Test
	public void getMaptest() {
	HashMap<String, ProductStock> map=dbs.getMap();
	assertNotNull(map);
	}

}
