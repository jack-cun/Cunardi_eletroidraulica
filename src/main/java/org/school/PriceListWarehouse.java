package org.school; // Assuming this is the package name

import java.io.*;
import java.util.*;

public class PriceListWarehouse {
    private ArrayList<Article> articles = new ArrayList<>();

    // Method to add an article to the price list/warehouse
    public void addArticle(Article article) {
        articles.add(article);
    }

    // Method to print information about a specific article based on its code
    public void printArticleInformation(String code) {
        for (Article article : articles) {
            if (article.getCode().equalsIgnoreCase(code)) {
                System.out.println(article);
                return;
            }
        }
        System.out.println("Article not found.");
    }

    // Method to print all articles in the warehouse in alphabetical order of their descriptions
    public void printArticlesInWarehouseAlphabeticalOrder() {
        ArrayList<Article> articlesInWarehouse = new ArrayList<>();
        for (Article article : articles) {
            if (article.getQuantity() > 0) {
                articlesInWarehouse.add(article);
            }
        }
        Collections.sort(articlesInWarehouse, Comparator.comparing(Article::getDescription));
        for (Article article : articlesInWarehouse) {
            System.out.println(article);
        }
    }

    // Method to print articles whose descriptions contain a specified word
    public void printArticlesWithWordInDescription(String word) {
        ArrayList<Article> articlesWithWord = new ArrayList<>();
        for (Article article : articles) {
            if (article.getDescription().toLowerCase().contains(word.toLowerCase())) {
                articlesWithWord.add(article);
            }
        }
        Collections.sort(articlesWithWord, Comparator.comparing(Article::getDescription));
        for (Article article : articlesWithWord) {
            System.out.println(article);
        }
    }

    // Method to save the article data to a file
    public void saveToFile(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(articles);
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error while saving to file.");
            e.printStackTrace();
        }
    }

    // Method to load article data from a file
    public void loadFromFile(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            articles = (ArrayList<Article>) inputStream.readObject();
            System.out.println("Data loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while loading from file.");
            e.printStackTrace();
        }
    }
}
