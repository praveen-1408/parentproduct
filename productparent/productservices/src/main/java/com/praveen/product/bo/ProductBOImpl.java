package com.praveen.product.bo;

import com.praveen.product.dao.ProductDAO;
import com.praveen.product.dao.ProductDAOImpl;
import com.praveen.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
				return dao.read(id);
	}

}
