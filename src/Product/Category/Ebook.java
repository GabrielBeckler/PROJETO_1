package Product.Category;

import Product.Product;

public class Ebook extends Product {

    private String author;
    private String publisher;
    private int format; // cod
    private int pages;
    private String language;
    private double fileSize;

    public Ebook(String name,
                 String code,
                 String description,
                 double price,
                 String author,
                 String publisher,
                 int format,
                 int pages,
                 String language,
                 double fileSize) {

        super(name, code, description, price);

        this.author = author;
        this.publisher = publisher;
        this.format = format;
        this.pages = pages;
        this.language = language;
        this.fileSize = fileSize;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
}