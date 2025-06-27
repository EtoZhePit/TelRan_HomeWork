package telran.homework.product.dao;

import telran.homework.product.model.Product;

import java.util.Objects;
import java.util.function.Predicate;

public class ProductStorageImpl implements ProductStorage{
    private int size;
    Product[] products;


    public ProductStorageImpl(int capacity) {
        products = new Product[capacity];
    }



    @Override
    public boolean addProduct(Product product) {
        if (product == null || size == products.length || findProductById(product.getId()) != null ) {
            return false;
        }
        products[size] = product;
        size++;
            return true;
    }

    @Override
    public Product removeProduct(String id) {
        for (int i = 0; i < size ; i++) {
            if (Objects.equals(products[i].getId(), id)) {
                Product victim = products[i];
                products[i] = products[size-1];
                size--;
                return victim;
            }
        };
        return null;
    }

    @Override
    public Product findProductById(String id) {
        for (int i = 0; i < size ; i++) {
            if (Objects.equals(products[i].getId(), id)) {
                return products[i];
            }
        };
        return null;
    }

    @Override
    public Product[] findProductByName(String name) {
        return findProductByPredicate(p -> Objects.equals(p.getName(), name));
    }

    @Override
    public Product[] findProductByCategory(String category) {
        return findProductByPredicate(p -> p.getCategory().equals(category) );
    }

    @Override
    public Product[] findProductByPrice(double min) {
        return findProductByPredicate(p -> min <= p.getPrice());
    }

    @Override
    public Product[] findProductByQuantity(int min, int max) {
        return findProductByPredicate(p -> min <= p.getQuantity() && max > p.getQuantity() );
    }

    private Product[] findProductByPredicate (Predicate <Product> predicate) {
        int actual = 0;

        for (int i = 0; i < size ; i++) {
            if (predicate.test(products[i])){
                actual++;
            }
        }
        Product[] res = new Product[actual];
        for (int i = 0, j = 0; i < size ; i++) {
            if (predicate.test(products[i])) {
                res[j++] = products[i];
            }
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }
}
