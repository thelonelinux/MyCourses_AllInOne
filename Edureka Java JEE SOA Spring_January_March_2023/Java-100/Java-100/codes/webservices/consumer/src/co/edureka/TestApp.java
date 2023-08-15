package co.edureka;

import co.edureka.services.Nums;
import co.edureka.services.NumsServiceLocator;

public class TestApp {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator();
		
		Nums ref = locator.getNums();
		
		int x = 12;
		int y = 14;
		int sum = ref.add(x, y);
		
		System.out.println(x + " + " + y + " = " + sum);
	}

}
