package student.classes;

public class Product {
    //initialise variables
   private String productDescription;
   private int netPrice;
   //private int unitsInStock;4
   //private int stockReorderThreshold;1

    //Constructor
    public Product(){
        productDescription= "Empty";
        netPrice=0;
    }

    public void setNewProduct(String description, int nPrice){
        productDescription = description;
        netPrice =  nPrice;
    }
    /*public Product addProduct(Product productName,int netPrice,int unitsInStock,int stockReorderThreshold){
        productName.netPrice=netPrice;
        productName.unitsInStock=unitsInStock;
        productName.stockReorderThreshold=stockReorderThreshold;
        return productName;
    }*/
  //  public double getGrossPrice(double priceBeforeTax){
  //     return priceBeforeTax*=1.25;
   //}
    //Functions
   // ailable()
 //- getSalesTax()
 //- get GrossPrice()
 //- checkStockLevelAndMaybeReorder()
 //   public String productToString(){
 //       String output = "Product description is: " + productDescription + " net price is " + "netPrice";
 //       return output;
  //  }
}
