package com.cg.ddelight.dao;
import java.util.HashMap;

import com.cg.ddelight.main.ProductStock;
public class DataBaseDao {
public static HashMap<String, ProductStock> map=new HashMap<String, ProductStock>();
	
	
	public static void data() {
		map.put("1",new ProductStock("1","mango juice", "wh1", 20.0));
		map.put("2",new ProductStock("2","Banana Shake", "wh2", 30.0));
		map.put("3",new ProductStock("3","Grapes juice", "wh3", 40.0));
		map.put("4",new ProductStock("4","Pineapple juice", "wh4", 50.0));
	}
	public static HashMap<String, ProductStock> getMap() {
		return map;
	}
	public static void setmMap(HashMap<String, ProductStock> map) {
		DataBaseDao.map = map;
	}
}
