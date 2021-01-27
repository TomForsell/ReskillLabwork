package student.classes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //instance of objects
        CommonUsableMethods myCommonMethods = new CommonUsableMethods();
        Product myProduct = new Product();
        Inventory myInventory = new Inventory();
        presentUserMenu();
        doUserActionsFromMenu(myCommonMethods, myProduct, myInventory);
    }

    private static void doUserActionsFromMenu(CommonUsableMethods myCommonMethods, Product myProduct, Inventory myInventory) {
        int userInput;
        do switch ( userInput = myCommonMethods.getUserInputInt("Choose an option from the menu: ")) {
            case 1:
                addProductToInventory(myCommonMethods, myProduct, myInventory);
                System.out.println("\n");
                presentUserMenu();
                break;
            case 2:
                System.out.flush();
                System.out.println("\nSorry - this will be released in next version");
                presentUserMenu();
                break;
            case 3:
                System.out.println("\nnumber of products are " + myInventory.getNumberOfProducts());
                presentUserMenu();
                break;
            case 4:
                break;
            default:
                System.out.println("\nIllegal input, please try again");
                presentUserMenu();
        } while (userInput!=4);
    }

    private static void addProductToInventory(CommonUsableMethods myCommonMethods,Product myProduct, Inventory myInventory){
        /*Did a major mistake in this one where I instanceiated every time this method was called. I had to do a lot of time consuming bugging
         before I found it. Really rookie mistake, but lesson learnt.There is probably a way better method of doing this then what I did here, so if you can
          address it tomorrow I will be grateful */
        String productDescription = myCommonMethods.getUserInputString("Input a product description:");
        int price = myCommonMethods.getUserInputInt("Input net Price of product:");
        myProduct.setNewProduct(productDescription,price);
        myInventory.addProduct(myProduct);
    }

    private static void presentUserMenu() {
        for (String s : Arrays.asList("1:Add New Product to inventory",
                "2:Remove product from inventory",
                "3:Number of products in inventory",
                "4: Exit")) {
            System.out.println(s);
        }
    }

}
