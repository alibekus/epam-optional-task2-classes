package kz.akbar.model;

public class UPC {

    public static String generateUpc(String productName, String manufacturerName) {
        return manufacturerName + productName + Math.random()*1000;
    }

}
