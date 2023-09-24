package org.school;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        PriceListWarehouse priceListWarehouse = new PriceListWarehouse();

        // Example of adding articles to the price list/warehouse
        priceListWarehouse.addArticle(new Article("A001", "Product 1", 10.99, 100, "Shelf A"));
        priceListWarehouse.addArticle(new Article("A002", "Product 2", 20.49, 50, "Shelf B"));

        // Example of printing article information
        priceListWarehouse.printArticleInformation("A001");

        // Example of printing all articles in the warehouse in alphabetical order
        priceListWarehouse.printArticlesInWarehouseAlphabeticalOrder();

        // Example of printing articles with a word in the description
        priceListWarehouse.printArticlesWithWordInDescription("Product");

        // Example of saving to a file
        priceListWarehouse.saveToFile("pricelist.dat");

        // Example of loading from a file
        priceListWarehouse.loadFromFile("pricelist.dat");
    }
}
