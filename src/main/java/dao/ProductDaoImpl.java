package dao;

import Store.Product;
import api.ProductDao;
import utils.FileUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Objects;

public class ProductDaoImpl implements ProductDao
    {
    private final String fileName;
    private final String productType;

    public ProductDaoImpl(String fileName,String productType) throws IOException
        {
        this.fileName = fileName;
        this.productType = productType;
        FileUtils.createNewFile(fileName);

        }

    @Override
    public void saveProduct(Product product) throws FileNotFoundException
        {
        List<Product>products = getAllProducts();
        products.add(product);
        saveProducts(products);
        }

    @Override
    public void saveProducts(List<Product> products) throws FileNotFoundException
        {
        FileUtils.clearFile(fileName);
        PrintWriter printWriter = new PrintWriter( new FileOutputStream(fileName,true));
        for(Product product:products)
            {
            printWriter.write(product.toString() + "\n");

            }
        printWriter.close();
        }

    @Override
    public void removeProductById(Long productId)
        {
        List<Product>products = getAllProducts();

        for(int i = 0;i<products.size();i++)
            {
            boolean isFoundProduct = products.get(i).getId().equals(productId);
            if(isFoundProduct)
                {
                products.remove(i);
                }
            }
        }

    @Override
    public void removeProductByName(String productName)
        {
        List<Product>products = getAllProducts();
        for(int i = 0;i<products.size();i++)
            {
            boolean isFoundproduct = products.get(i).getProductName().equals(productName);
            if(isFoundproduct)
                {
                products.remove(i);
                }
            }

        }

    @Override
    public List<Product> getAllProducts()
        {
        return null;
        }

    @Override
    public Product getProductById(Long productId)
        {
        return null;
        }

    @Override
    public Product getProductByName(String productName)
        {
        return null;
        }
    }
