package homework.prob3;
import java.util.*;
public class OrderTest {
    public static void main(String[] args) {
        // a) creating orderList
       List<Order> orderList=new ArrayList<>(); // Creating the list
       // b) Creating and Adding Objects to the orderList
       Order o1=new Order("1010","Mark",1111);
          orderList.add(o1);
        Order o2=new Order("1033","Henry",10);
          orderList.add(o2);
        Order o3=new Order("1212","Diana",11);
          orderList.add(o3);
        Order o4=new Order("1001","Liam",11);
          orderList.add(o4);
        Order o5=new Order("1011","Selina",1111);
          orderList.add(o5);
        System.out.println(orderList);
        //c) Deleting an object by instance
       System.out.println(orderList.remove(o4));
        //d ) Printing the size of the list
        System.out.println(orderList.size());
        // e) Retrieve an order by position
        System.out.println(orderList.get(1));
        // f) Update the details of an order
        System.out.println(orderList.set(3,new Order("1112","Bella",99)));
        // h) Sorting by total amount
        //Before Sorting
        System.out.println(orderList);
        Collections.sort(orderList,Comparator.comparing(Order::getTotalAmount));
        //After Sorting
        System.out.println(orderList);
        List<Order> li=listMoreThan50(orderList);
        Collections.sort(li,Comparator.comparing(Order::getCustomerName));
        System.out.println(li);
    }
    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        if(list==null)return null;
        List<Order> listNew=new ArrayList<>();
        for(Order o:list){
            if(o.getTotalAmount()>50){
                listNew.add(o);
            }
        }
        return listNew;
    }
}
