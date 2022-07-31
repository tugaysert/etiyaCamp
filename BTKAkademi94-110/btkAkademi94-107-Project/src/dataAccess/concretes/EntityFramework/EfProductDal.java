package dataAccess.concretes.EntityFramework;

import dataAccess.abstracts.IProductDal;
import entities.concretes.Customer;
import entities.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class EfProductDal implements IProductDal {

    private final List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }
}
