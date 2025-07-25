package oops;
// Class FoodItem
// This is the base class that contains common food order information such as itemId, itemName, unitPrice, and quantity. It includes two methods.
// calculateBill returns the final total after applying GST and discount rules
// displayDetails prints itemId, itemName, unit price, quantity, charges, GST, discount (if any), and total bill
class FoodItem{
    int itemId;
    String itemName;
    double unitPrice,quantity;
    double discount;
    double gst;
    double basecost;
    double bill;
    FoodItem(int itemId,String itemName,double unitPrice,double quantity){
        this.itemId=itemId;
        this.itemName=itemName;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
    double calculateBill(){
        basecost=unitPrice*quantity;
        gst=basecost*0.05;
        bill=(basecost+gst);
        if (bill>1000){
            discount=bill*0.10;
        }
        bill-=discount;
        return bill;
    }
    void displayDetails(){
        System.out.println("Itemid : "+itemId);
        System.out.println("Item Name: "+itemName);
        System.out.println("Unit Price "+unitPrice);
        System.out.println("Quantity : "+quantity);
        System.out.println("Charged Amount: "+this.basecost);
        System.out.println("Gst applied: "+gst);
        System.out.println("Discount applied: "+discount);
        System.out.println("Total bill is: "+bill);

    }
}
// Class DineIn extends FoodItem
// This class has an additional field called serviceCharge
// calculateBill is overridden to calculate base cost as unitPrice multiplied by quantity, then add serviceCharge, then add 5 percent GST. If the total exceeds ₹1000, a 10 percent discount is applied.
// displayDetails prints all item details including service charge, GST, discount (if applicable), and total bill
class DineIn extends FoodItem{
    double serviceCharge;
    
    DineIn(int itemId, String itemName, double unitPrice, double quantity) {
        super(itemId, itemName, unitPrice, quantity);
    }
    @Override
    double calculateBill(){
        
        basecost=unitPrice*quantity;
        serviceCharge=basecost*0.01;
        gst=basecost*0.05;
        bill=(basecost+gst+serviceCharge);
        if (bill>1000){
            discount=bill*0.10;
            bill-=discount;
        }
        return bill;
    } 
    void displayDetails(){
        System.out.println("Itemid : "+itemId);
        System.out.println("Item Name: "+itemName);
        System.out.println("Unit Price "+unitPrice);
        System.out.println("Quantity : "+quantity);
        System.out.println("Charged Amount: "+super.basecost);
        System.out.println("Gst applied: "+gst);
        System.out.println("Discount applied: "+discount);
        System.out.println("Total bill: "+bill);

    }
    
}
// Class Takeaway extends FoodItem
// This class has an additional field called packingCharge
// calculateBill is overridden to calculate base cost as unitPrice multiplied by quantity, then add packingCharge, then 5 percent GST, and discount if applicable
// displayDetails prints item details including packing charge, GST, discount, and final total
class Takeaway extends FoodItem{
    double packingCharge;
    Takeaway(int itemId, String itemName, double unitPrice, double quantity) {
        super(itemId, itemName, unitPrice, quantity);
        //TODO Auto-generated constructor stub        
    }
    double calculateBill(){
        packingCharge=5;
        basecost=unitPrice*quantity;
        gst=basecost*0.05;
        bill=(basecost+packingCharge+gst);
        if (bill>1000){
            discount=bill*0.10;
            bill-=discount;
        }
        return bill;
    }
    void displayDetails(){
        System.out.println("Itemid : "+itemId);
        System.out.println("Item Name: "+itemName);
        System.out.println("Unit Price "+unitPrice);
        System.out.println("Quantity : "+quantity);
        System.out.println("Packaging Amount: "+packingCharge);
        System.out.println("Gst applied: "+gst);
        System.out.println("Discount applied: "+discount);
        System.out.println("Total bil is: "+bill);
    }
    
}
// Class Delivery extends FoodItem
// This class includes a deliveryFee field
// calculateBill is overridden to calculate base cost as unitPrice multiplied by quantity, then add deliveryFee, apply 5 percent GST, and 10 percent discount if applicable
// displayDetails prints item details including delivery fee, GST, discount, and final bill
class Delivery extends FoodItem{
    double deliveryFee;
    Delivery(int itemId, String itemName, double unitPrice, double quantity) {
        super(itemId, itemName, unitPrice, quantity);
        //TODO Auto-generated constructor stub
    }
    double calculateBill(){
        basecost=unitPrice*quantity;
        deliveryFee=50;
        gst=basecost*0.05;
        bill=(basecost+gst+deliveryFee);
        if (bill>1000){
            discount=bill*0.10;
            bill-=discount;
        }
        return bill;
    }
    void displayDetails(){
        System.out.println("Itemid : "+itemId);
        System.out.println("Item Name: "+itemName);
        System.out.println("Unit Price "+unitPrice);
        System.out.println("Quantity : "+quantity);
        System.out.println("Delivery charges: "+deliveryFee);
        System.out.println("Gst applied: "+gst);
        System.out.println("Discount applied: "+discount);
        System.out.println("Total bil is: "+bill);
    }
    
}


public class ResataurantbillingSystem {
    public static void main(String[] args) {
        FoodItem ob=new FoodItem(123,"rice", 20, 2);
        DineIn ob1=new DineIn(124, "Chicken roll", 50, 3);
        Takeaway ob2=new Takeaway(165, "Chicken Burger", 69, 5);
        Delivery ob3=new Delivery(789, "pizza", 249, 2);
        ob.calculateBill();
        ob.displayDetails();
        ob1.calculateBill();
        ob1.displayDetails();
        ob2.calculateBill();
        ob2.displayDetails();
        ob3.calculateBill();
        ob3.displayDetails();
    }
}
