import javax.swing.*;

public class Order extends Cart{
    private int orderId =1 ;
    private float totalPrice = calculatePrice(getProducts()) ;

    public int Order(){
        return orderId++;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        if (orderId>=0) {
            this.orderId = orderId;
        }
        else {
            this.orderId =Math.abs(orderId);
        }
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        if (totalPrice>=0) {
            this.totalPrice = totalPrice;
        }
        else {
            this.totalPrice =Math.abs(totalPrice);
        }
    }
    public void printOrderInfo(Cart cart){
        JOptionPane.showMessageDialog(null,"Order ID : "+getOrderId());
        cart.placeOrder();

    }
}
