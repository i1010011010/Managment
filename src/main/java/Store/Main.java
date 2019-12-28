package Store;

;

public class Main
{
    public static void main (String[]args)
    {
        Product product = new Product(23,"dupa",1000,20,"red",250);
        newprice = product.setPrice(3000);
        newCount = product.setProductCount(220);

        System.out.println(newprice);
        System.out.println(newCount);


    }
}
