package com.cg.ddelight.ui;
import java.time.LocalDate;
import java.util.Scanner;

import com.cg.ddelight.dao.DataBaseDao;
import com.cg.ddelight.main.ProductStock;
import com.cg.ddelight.service.ProductStockService;

public class ProductStockMain {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ProductStockMain pm = new ProductStockMain();
		DataBaseDao.data();

		pm.selectCase();

		pm.sc.close();

	}

	public void update() {

		try {

			System.out.println("Enter Order Id: ");
			String id = sc.next();
			System.out.println("Enter Exit Date:- in (YYYYMMDD)");
			String date = sc.next();

			System.out.println(ProductStockMain.setExitDate(id, splitDate(date)));

			System.out.println("Enter Manufacturing Date:- in (YYYYMMDD)");
			String mDate = sc.next();
			System.out.println("Enter Expiry Date:- in (YYYYMMDD)");
			String eDate = sc.next();
	    	System.out.println("Enter Quantity:-");
	    	double qt = sc.nextDouble();
			System.out.println("Enter quality status: ");
			String qs = sc.next();

			System.out.println(ProductStockMain.updateProductStock(id, splitDate(mDate), splitDate(eDate),qs,qt ) + "\n");//qs

			selectCase();

		} catch (Exception e) {

			System.out.println(e);

		}
	}

	public LocalDate splitDate(String date) {
		int y, m, d;
		y = Integer.parseInt(date.substring(0, 4));
		m = Integer.parseInt(date.substring(4, 6));
		d = Integer.parseInt(date.substring(6, 8));
		LocalDate dt = LocalDate.of(y, m, d);
		return dt;
	}

	public static String setExitDate(String id, LocalDate date) {
		ProductStockService ps = new ProductStockService();
		return ps.exitDateCheck(id, date);
	}

	public static String updateProductStock(String orderId, LocalDate manufacturingDate, LocalDate expiryDate, String qualityAnalysis,double Quantity) {
		ProductStockService ps = new ProductStockService();
		return ps.updateProductStock(orderId, manufacturingDate, expiryDate,qualityAnalysis,Quantity);//qualityAnalysis
	}

	public void selectCase() {
		//while(true) {
		System.out.println("Select Operation:\n 1-Update Product Stock\n 2-Show Stock Details\n 3-Show All Stock Details\n");
		String so = sc.next();
		switch (so) {
		case "1":
			update();
			break;
		case "2":
			showProductStockDetails();
			break;
		case "3":
			showAllStockDetails();
			break;
		default:
			System.out.println("Invalid Choice...");
			break;
		}
	}
//}
	public void showProductStockDetails() {
		System.out.println("Enter order Id: ");
		String orderId=sc.next();
		if(DataBaseDao.getMap().containsKey(orderId)) {
			ProductStock V=DataBaseDao.getMap().get(orderId);
			System.out.println("Order Id - " + V.getOrderId() + "\n" + "Name - " + V.getName() + "\n"
					+ "Quantity value - " + V.getQuantityValue() + "\n" + "Manufacturing Date - "
					+ V.getManufacturingDate() + "\n" + "Expiry Date - " + V.getExpiryDate() + "\n" + "Exit Date - "
					+ V.getExitDate() + "\n" + "Quality - " + V.getQualityCheck() + "\n");
		}else {
			System.out.println("ID not exists...");
		}
		selectCase();
	}

	public void showAllStockDetails() {
		DataBaseDao.getMap().forEach((K, V) -> {
			System.out.println("Order Id - " + V.getOrderId() + "\n" + "Name - " + V.getName() + "\n"
					+ "Quantity value - " + V.getQuantityValue() + "\n" + "Manufacturing Date - "
					+ V.getManufacturingDate() + "\n" + "Expiry Date - " + V.getExpiryDate() + "\n" + "Exit Date - "
					+ V.getExitDate() + "\n" + "Quality - " + V.getQualityCheck() + "\n");
		});
		selectCase();
}}
