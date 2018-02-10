package pl.sternik.mj.sklep;

import java.util.Date;

public class Shop {
    private static int[][] popularProductsQuantityp;

    class Order {

        private int[] quantities;
        private Date orderDate;

        public int[] getQuantities() {
            return quantities;
        }

        public void setQuantities(int[] quantities) {
            this.quantities = quantities;
        }

        public Date getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
        }

        void accept() {
            for (int i = 0; i < popularProductsQuantityp.length; i++) {
                Integer isPresent = (Integer) popularProductsQuantityp[i][1];
                Integer newOrder = quantities[i];
                Integer together = isPresent + newOrder;
                popularProductsQuantityp[i][1] = together;
            }
        }




    }

    public static void main(String[] args) {
        Shop sklep = new Shop();

        Shop.Order zam1 = sklep.new Order();
        zam1.orderDate = new Date();

        int[] zam = { 10, 10, 10, 10, 10, 5, 0, 5, 0, 5 };
        zam1.quantities = zam;
        zam1.accept();
    }






}
