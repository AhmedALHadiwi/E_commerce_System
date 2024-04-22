import javax.swing.*;

public class EcommerceSystem {
    public static void main(String[] args) {
        ElectronicProduct smartPhone = new ElectronicProduct(1,"Smart Phone",599.9f,"Samsung",1);
        ClothingProduct T_shirt = new ClothingProduct(2,"T_shirt",19.99f,"Medium","Cotton");
        BookProduct oop = new BookProduct(3,"OOP",39.99f,"O'Reilly","X Pubication");
        Customer c1 = new Customer();
        Cart cart1 =new Cart();
        Order o1 =new Order();

        JOptionPane.showMessageDialog(null,"Welcome to thte E_Commerce System !");

        int id = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Your ID : "));
       c1.setCustomerId(id);
       cart1.setCustomerId(id);


        String name =JOptionPane.showInputDialog("Please Enter Your Name : ");
        c1.setName(name);



        String address =JOptionPane.showInputDialog("Please Enter Your address : ");
        c1.setAddress(address);


        int n = Integer.parseInt(JOptionPane.showInputDialog("How many products you want to add to your cart ? "));
        cart1.setN(n);

        Product[] products = new Product[cart1.getN()];
        cart1.setProducts(products);

        for (int i=1 ; i<=cart1.getN(); i++) {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Which product you want to add ? \n 1- Smart Phone   2- T_shirt   3- OPP"+"\n Chose  a Product by enter this number"));
            switch (x) {
                case 1:cart1.addProduct(smartPhone);
                    break;
                case 2:cart1.addProduct(T_shirt);
                    break;
                case 3:cart1.addProduct(oop);
                    break;
            }
        }
        JOptionPane.showMessageDialog(null,"Your Total Price is "+cart1.calculatePrice(cart1.getProducts()));

        int m =Integer.parseInt(JOptionPane.showInputDialog("Would you want to place the order? \n 1- Yes  2- No"+"\n Enter your choise"));
        switch (m){
            case 1: o1.printOrderInfo(cart1);
        }
    }
}