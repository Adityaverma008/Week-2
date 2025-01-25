// package Multilevel_inheritence;

class order{
    int orderId;
    String orderDate;

    order(int orderId , String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

class ShippedOrder extends order{           //this class inherit it's order parent class
        int tracking_order;
        ShippedOrder(int orderId , String orderDate , int tracking_order){   // we redefines constructor from the base class because inheritence doesnot inherit constructor
            super(orderId, orderDate); 
            this.tracking_order = tracking_order;
        }     
}

class DeliveredOrder extends ShippedOrder{          //this class inherit inherit it's upper parent class
    String delivery_date; 
    DeliveredOrder(int orderId , String orderDate , int tracking_order , String delivery_date){
        super(orderId, orderDate , tracking_order);
        this.delivery_date = delivery_date;
    }

    void getOrderStatus(){                      //this function display all the order details
        System.out.println("The order id is:- " + orderId);
        System.out.println("The orderdate is:- " + orderDate);
        System.out.println("The tracking order is :- " + tracking_order);
        System.out.println("The delivery date is:- " + delivery_date);
    }
}

public class shopping {
    public static void main(String[] args) {
        DeliveredOrder obj = new DeliveredOrder(12004 , "12/12/12" , 004420 , "11/11/11"  );

        obj.getOrderStatus();
        
    }
}
