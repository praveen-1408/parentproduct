package com.praveen.product.bo;

import com.praveen.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	Product findProduct(int id);

}
