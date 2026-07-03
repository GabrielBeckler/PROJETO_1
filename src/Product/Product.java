package Product;

public class Product {

    private static int contadorId = 1;

    private final int id;
    private String name;
    private String code;
    private String description;
    private double price;

    public Product(String name,
                   String code,
                   String description,
                   double price) {

        this.id = contadorId++;
        this.name = name;
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}