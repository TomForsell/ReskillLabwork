package student.classes;

import java.util.ArrayList;

public class Inventory {

//Cant believe I spent all this time on this little code
    private static ArrayList<Product> products  = new ArrayList<Product>();

    public static void addProduct(Product aProduct){
        products.add(aProduct);
    }

    public static int getNumberOfProducts(){
        return products.size();
    }
    public static void addProductToInventory(Product myProduct){
        products.add(myProduct);
    }
    public static Product getProductId(int arrayID){
        return products.get(arrayID);

    }
}
