package kz.akbar;

import kz.akbar.model.Manufacturer;
import kz.akbar.model.Product;
import kz.akbar.model.UPC;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    private static final Manufacturer MANUFACTURER_1 = new Manufacturer("M1", new Manufacturer.Address("Kaz", "Almaty", "Street1", 1));
    private static final Manufacturer MANUFACTURER_2 = new Manufacturer("M2", new Manufacturer.Address("Kaz", "Semey", "Street2", 2));
    private static final Manufacturer MANUFACTURER_3 = new Manufacturer("M3", new Manufacturer.Address("Kaz", "Astana", "Street3", 3));

    private static final Product PRODUCT_1 = new Product("Product1", UPC.generateUpc("Product1", MANUFACTURER_1.getName()), MANUFACTURER_1, 10.32, new Date(2019, 4, 12), 10);
    private static final Product PRODUCT_2 = new Product("Product2", UPC.generateUpc("Product2", MANUFACTURER_2.getName()), MANUFACTURER_2, 20.83, new Date(2014, 11, 4), 20);
    private static final Product PRODUCT_3 = new Product("Product3", UPC.generateUpc("Product3", MANUFACTURER_3.getName()), MANUFACTURER_3, 15.87, new Date(2015, 1, 17), 35);
    private static final Product PRODUCT_4 = new Product("Product4", UPC.generateUpc("Product4", MANUFACTURER_2.getName()), MANUFACTURER_2, 14.63, new Date(2012, 6, 30), 15);
    private static final Product PRODUCT_5 = new Product("Product5", UPC.generateUpc("Product5", MANUFACTURER_1.getName()), MANUFACTURER_1, 25.76, new Date(2016, 8, 23), 40);
    private static final Product PRODUCT_6 = new Product("Product6", UPC.generateUpc("Product6", MANUFACTURER_1.getName()), MANUFACTURER_1, 10.32, new Date(2019, 4, 12), 10);
    private static final Product PRODUCT_7 = new Product("Product7", UPC.generateUpc("Product7", MANUFACTURER_2.getName()), MANUFACTURER_2, 20.83, new Date(2014, 11, 4), 20);
    private static final Product PRODUCT_8 = new Product("Product8", UPC.generateUpc("Product8", MANUFACTURER_3.getName()), MANUFACTURER_3, 15.87, new Date(2015, 1, 17), 35);
    private static final Product PRODUCT_9 = new Product("Product9", UPC.generateUpc("Product9", MANUFACTURER_2.getName()), MANUFACTURER_2, 14.63, new Date(2012, 6, 30), 15);
    private static final Product PRODUCT_10 = new Product("Product10", UPC.generateUpc("Product10", MANUFACTURER_1.getName()), MANUFACTURER_1, 25.76, new Date(2016, 8, 23), 40);

    static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        productList.add(PRODUCT_1);
        productList.add(PRODUCT_2);
        productList.add(PRODUCT_3);
        productList.add(PRODUCT_4);
        productList.add(PRODUCT_5);
        productList.add(PRODUCT_6);
        productList.add(PRODUCT_7);
        productList.add(PRODUCT_8);
        productList.add(PRODUCT_9);
        productList.add(PRODUCT_10);
        LOG.info("Products with 'product1' name");
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase("product1")) {
                LOG.info(product.getName());
            }
        }
        LOG.info("Products with 'product3' name and price less than 16.0");
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase("product3") & product.getPrice() < 16.0) {
                LOG.info(product.getName());
            }
        }
        Date expireDate = new Date(2015, 1, 1);
        LOG.info("Products with expire date late than " + expireDate.getYear() + "-" + expireDate.getMonth() + "-" + expireDate.getDay());
        for (Product product : productList) {
            Date productExpireDate = product.getExpireDate();
            int year = product.getExpireDate().getYear();
            int month = product.getExpireDate().getMonth();
            int day = product.getExpireDate().getDay();
            if (year > expireDate.getYear() && month > expireDate.getMonth() && day > expireDate.getDay()) {
                LOG.info(product.getName());
            }
        }
    }
}
