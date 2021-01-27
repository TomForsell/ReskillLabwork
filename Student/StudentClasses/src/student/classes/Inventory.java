package student.classes;

import java.util.ArrayList;

public class Inventory {

//Cant believe I spent all this time on this little code
    private ArrayList<Product> products  = new ArrayList<Product>();

    public void addProduct(Product aProduct){
        products.add(aProduct);
    }

    public int getNumberOfProducts(){
        return products.size();
    }
}
