package Store;

public class Cloth extends Product
{
    String size;
    String material;

    public Cloth(Long id, String productName, float price, int weight, String color, int productCount)
    {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    public String getSize()
    {
        return size;
    }

    public String getMaterial()
    {
        return material;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
