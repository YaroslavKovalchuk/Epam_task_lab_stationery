
public class Stationery {

    private long id;
    private String name;
    private String productionCompany;
    private double price;
    private Color color;
    private KindOfGoods kindOfGoods;

    public Stationery(long id, String name, String productionCompany, double price, Color color) {
        this.id = id;
        this.name = name;
        this.productionCompany = productionCompany;
        this.price = price;
        this.color = color;
        this.kindOfGoods = new KindOfGoods();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public KindOfGoods addKindOfGoods() {
        return kindOfGoods;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", production company='" + productionCompany + '\'' +
                ", price=" + price +
                ", color=" + color +
                "," + kindOfGoods +
                '}' + "\n";
    }
}
