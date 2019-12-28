package Store;

public class Product
{

    long id;
    String productName;
    float price;
    int weight;
    String color;
    int productCount;

    Product(long id,String productName,float price,int weight,String color,int productCount)
    {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }
    public void setPrice(float price)
    {
        this.price = price;
    }

    public void setProductCount(int productCount)
    {
        this.productCount = productCount;
    }
    public long getId()
    {
        return id;
    }

    public String getProductName()
    {
        return productName;
    }

    public float getPrice()
    {
        return price;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getColor()
    {
        return color;
    }

    public int getProductCount()
    {
        return productCount;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}

