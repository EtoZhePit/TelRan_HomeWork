package telran.homework.product.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.homework.product.dao.ProductStorage;
import telran.homework.product.dao.ProductStorageImpl;
import telran.homework.product.model.Product;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product[] products;
    ProductStorage productStorage;

    @BeforeEach
    void setUp() {
        productStorage = new ProductStorageImpl(5);
        products = new Product[5];
        products[0] = new Product("111", "Apple", "Fruit", 7.0, 10);
        products[1] = new Product("222", "Orange", "Fruit", 5.0, 15);
        products[2] = new Product("333", "Bread", "Bakery", 12.0, 20);
        products[3] = new Product("444", "Milk", "Dairy", 8.0, 25);
        for (int i = 0; i <products.length ; i++) {
            productStorage.addProduct(products[i]);
        }

    }

    @Test
    void addProduct() {
    assertFalse(productStorage.addProduct(products[0]));
    Product test = new Product("555", "noodle", "Bakery", 14.0, 20);
    assertTrue(productStorage.addProduct(test));
    Product test2 = new Product("666", "water", "Dairy", 8.0, 25);
    assertFalse(productStorage.addProduct(test2));
    }

    @Test
    void removeProduct() {
        assertNull(productStorage.removeProduct("555"));
        Product actual = productStorage.removeProduct("222");
        assertEquals(actual, products[1]);
        assertEquals(3, productStorage.size());
    }

    @Test
    void findProductById() {
    assertEquals(productStorage.findProductById("111"), products[0]);
    assertNull(productStorage.findProductById("777"));
    }

    @Test
    void findProductByName() {
        Product[] actual = productStorage.findProductByName("Milk");
        assertEquals("Milk", actual[0].getName());

        Product[] notActual = productStorage.findProductByName("Burger");
        assertEquals(0, notActual.length);
    }

    @Test
    void findProductByCategory() {
        Product[] actual = productStorage.findProductByCategory("Fruit");
        Product[] expected = {products[0], products[1]};
        assertArrayEquals(expected, actual);


    }

    @Test
    void findProductByPrice() {
        Product[] actual = productStorage.findProductByPrice(8);
        Product[] expected = {products[2], products[3]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findProductByQuantity() {
        Product[] actual = productStorage.findProductByQuantity(8,17);
        Product[] expected = {products[0], products[1]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
        assertEquals(4, productStorage.size() );
        assertNotEquals(10,productStorage.size());

    }
}