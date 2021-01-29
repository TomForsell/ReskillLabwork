package student.classes;

public class Product {
    //initialise variables
   private String productDescription;
   private int netPrice;
   private boolean isPerished;
   //private int unitsInStock;4
   //private int stockReorderThreshold;1

    //Constructor
    // ANDY Can use constructor chaining here.
    public Product(String s, int p){
        //Construcor for one type of product that can never be perished
        productDescription= s;
        netPrice=p;
    }

    public Product(String productDescription, int netPrice, boolean isPerished) {
        //Constructor for foods that can be perished
        //Not used at this time
        this.productDescription = productDescription;
        this.netPrice = netPrice;
        this.isPerished = isPerished;
    }

    {
        System.out.println("example of constructor chaining  ");
    }

    public String toString(){
        return ("Description: " + productDescription + "\nnetPrice: " + netPrice + "\n");
    }
}
