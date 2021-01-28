package student.classes;


public class Main {


    public static void main(String[] args) {
        CommonIO.userIOMenu();
        inputFromUser();
    }
    public static void inputFromUser() {
        int userInput;
        String userString;

        do {
            userInput = CommonIO.userIOInt("Choose an option from the menu: ");
            performUserAction(userInput);
        }
        while (userInput != 4);
    }

    private static void performUserAction(int userInput) {
        switch (userInput) {
            case 1:
                String s =CommonIO.userIOString("Input Description:");
                int i = CommonIO.userIOInt("Input net Price:");
                Product myProduct = new Product(s,i);
                Inventory.addProductToInventory(myProduct);
                CommonIO.userIOMenu();
                break;
            case 2:
                for(int k=0;k<Inventory.getNumberOfProducts();k++){
                    myProduct = Inventory.getProductId(k);
                    System.out.println("id: " + k);
                    System.out.println(myProduct.toString());
                    //System.out.println("Descrption: " + myProduct.productDescription);
                }
                CommonIO.userIOMenu();
                break;
            case 3:
                System.out.println("\nnumber of products are " + Inventory.getNumberOfProducts());
                CommonIO.userIOMenu();
                break;
            case 4:
                break;
            default:
                System.out.println("\nIllegal input, please try again");
                CommonIO.userIOMenu();
        }
    }

}
