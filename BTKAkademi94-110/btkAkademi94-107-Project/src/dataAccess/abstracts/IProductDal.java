package dataAccess.abstracts;

import entities.concretes.Employee;
import entities.concretes.Product;

import java.util.List;

public interface IProductDal {
    List<Product> getAll();

    void add(Product product);
}
