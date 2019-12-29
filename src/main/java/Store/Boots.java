package Store;

public class Boots extends Product
{
    int size;
    boolean isNaturalSkin;

    public Boots(Long id, String productName, float price, int weight, String color, int productCount)
    {
        super(id, productName, price, weight, color,productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isNaturalSkin()
    {
        return isNaturalSkin;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Boots{" +
                "size='" + size + '\'' +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}
