package commuityuni.com.test;

import commuityuni.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		
		SanPham sp1 = new SanPham();
		sp1.setMa(1411);
		sp1.setGia(10000);
		sp1.setTen("Cocacola");
		System.out.println(sp1);

	}

}
