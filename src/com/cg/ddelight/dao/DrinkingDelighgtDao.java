package com.cg.ddelight.dao;
import com.cg.ddelight.main.ProductStock;
public class DrinkingDelighgtDao {
public static ProductStockDaoImpl psi=new ProductStockDaoImpl();
	
	public static ProductStock findById(String id) {
		
		if(psi.doesProductOrderIdExistinStock(id)) {
	
			return DataBaseDao.getMap().get(id);
		}
		return null;
}}
