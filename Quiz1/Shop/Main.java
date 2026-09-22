import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer cust1 = new Customer("A1234", "Anne", "Malang", "0812344444");
        System.out.println(cust1.getInfo());

        Customer cust2 = new Customer("B5678", "Benny", "Surabaya", "08256788888");
        System.out.println(cust2.getInfo());

        cust2.deleteCustomer();
        System.out.println(cust2.getInfo());

        Product prd1 = new Product("DD112", 15000, "Drink");
        prd1.addProduct();

        Product prd2 = new Product("FF334", 20000, "Food");
        prd2.addProduct();

        prd2.modifyProduct("FF334", 25000, "Food");

        Order ord1 = new Order("O11", cust1, 2, new Date());
        System.out.println(ord1.getInfo());
        
        ord1.createOrder(prd1);

        ord1.editOrder("O22", 4, new Date());
        System.out.println(ord1.getInfo());


        prd1.selectProduct("DD112");

        Stock stck1 = new Stock(prd1, 30, 464);
        stck1.addStock(16);
        System.out.println((stck1.getInfo()));

        stck1.selectStockItem("DD112");



    }
}
