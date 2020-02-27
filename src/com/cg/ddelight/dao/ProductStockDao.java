package com.cg.ddelight.dao;
import com.cg.ddelight.main.ProductStock;
public interface ProductStockDao {
public String trackProductOrder(ProductStock productStock);
	
	//public boolean processDateCheck(ProductStock productStock);
	
	public String updateExitDateinStock(ProductStock productStock);
	
	public String updateProductStock(ProductStock productStock);
	
	public boolean doesProductOrderIdExistinStock(String orderId);
	
	//public boolean doesProductOrderIdExist(String orderId);
	
	public boolean exitDateCheck(ProductStock productStock);
}
