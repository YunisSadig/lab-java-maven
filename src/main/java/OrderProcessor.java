import Ironhack.com.Order;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class OrderProcessor {
    public void main(){
        processor();
    }
    public static void processor(){
        String json = """
        {
            "orderId": "1001",
            "customer": "Alice Smith",
            "items": [
                {"name": "Laptop", "quantity": 1, "price": 1200.50},
                {"name": "Mouse", "quantity": 2, "price": 25.75}
            ],
            "total": 1252.0
        }
        """;
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        Order orderJson=gson.fromJson(json,Order.class);

        System.out.println("Your order");
        System.out.println(orderJson);
    }
}
