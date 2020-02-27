package com.cg.ddelight.service;

import java.time.LocalDate;

import com.cg.ddelight.dao.DrinkingDelighgtDao;
import com.cg.ddelight.dao.ProductStockDao;
import com.cg.ddelight.dao.ProductStockDaoImpl;
import com.cg.ddelight.main.ProductStock;

public class ProductStockService {
	ProductStockDao psd=new ProductStockDaoImpl();
	public String exitDateCheck(String id, LocalDate date) {
		
		 ProductStock ps=DrinkingDelighgtDao.findById(id);

		 if(ps!=null) {
			 ps.setExitDate(date);
			 if(psd.exitDateCheck(ps)) {
				 ps.setExitDate(date);
				 return "Exit Date Set";
			 }
		 }
		 return "Exit Date not Set";
	}
	
	public String updateProductStock(String orderId, LocalDate manufacturingDate, LocalDate expiryDate,String qualityAnalysis, double quantity) {
		
		ProductStock ps=new ProductStock();
		ps.setOrderId(orderId);
		ps.setManufacturingDate(manufacturingDate);
		ps.setExpiryDate(expiryDate);
		ps.setQualityCheck(qualityAnalysis);
		ps.setQuantityValue(quantity);
		return psd.updateProductStock(ps);
		
		}

	public String trackProductOrder(ProductStock productStock) {
		return null;
	}

	public boolean processDateCheck(ProductStock productStock) {

		return false;
	}

	public String updateExitDateinStock(ProductStock productStock) {

		return null;
	}

//	public String updateProductStock(ProductStock productStock) {
//
//		return null;
//	}

	public boolean doesProductOrderIdExistinStock(String orderId) {

		return false;
	}

//	public boolean doesProductOrderIdExist(String orderId) {
//
//		return false;
//	}

//	public boolean exitDateCheck(ProductStock productStock) {
//
//		return false;
//	}
}
