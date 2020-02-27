package com.cg.ddelight.dao;
import java.time.LocalDate;

import com.cg.ddelight.main.ProductStock;
public class ProductStockDaoImpl implements ProductStockDao {
	@Override
	public String trackProductOrder(ProductStock productStock) {

		return null;
	}

//	@Override
//	public boolean processDateCheck(ProductStock productStock) {
//
//		return false;
//	}

	@Override
	public String updateExitDateinStock(ProductStock productStock) {

		return null;
	}

	@Override
	public String updateProductStock(ProductStock productStock) {
		ProductStock ps=DrinkingDelighgtDao.findById(productStock.getOrderId());
		if(ps!=null && this.validateManufacturingDate(productStock.getManufacturingDate()) && this.validateExpiryDate(productStock.getExpiryDate())) {
			ps.setManufacturingDate(productStock.getManufacturingDate());
			ps.setExpiryDate(productStock.getExpiryDate());
			ps.setQualityCheck(productStock.getQualityCheck());
			ps.setQuantityValue(productStock.getQuantityValue());
			return "Product Stock Updated";
		}
		
		
		return "Product Stock Not Updated";
	}

	@Override
	public boolean doesProductOrderIdExistinStock(String orderId) {
		
		
		if(DataBaseDao.getMap().containsKey(orderId)) {
			return true;
		}
		
		return false;
	}

//	@Override
//	public boolean doesProductOrderIdExist(String orderId) {
//
//		return false;
//	}
//	
	@Override
	public boolean exitDateCheck(ProductStock productStock) {
		if(productStock.getExitDate().compareTo(LocalDate.now())<0) {
			return true;
		}
		return false;
	}
	
	public boolean validateManufacturingDate(LocalDate manufacturingDate) {
		if(manufacturingDate.compareTo(LocalDate.now())<0) {
			return true;
		}
		return false;
	}
	
	public boolean validateExpiryDate(LocalDate expiryDate) {
		if(expiryDate.compareTo(LocalDate.now())>0) {
			return true;
		}
		return false;
	}
}
