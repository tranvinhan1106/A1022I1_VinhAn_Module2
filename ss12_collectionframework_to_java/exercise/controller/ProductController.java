package ss12_collectionframework_to_java.exercise.controller;

import ss12_collectionframework_to_java.exercise.model.Product;
import ss12_collectionframework_to_java.exercise.service.IProductService;
import ss12_collectionframework_to_java.exercise.service.ProductServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static IProductService service = new ProductServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("-------Product Management------");
            System.out.println("1. Add new Product");
            System.out.println("2. Edit product information by id");
            System.out.println("3. Delete product information by id");
            System.out.println("4. View list Product");
            System.out.println("5. Find product by name");
            System.out.println("6. Sort product Ascending");
            System.out.println("7. Sort product Descending");
            System.out.println("8. Exit");
            System.out.print("Please input number: ");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    System.out.print("Input id: ");
                    int id = scanner.nextInt();
                    System.out.print("Input name product: ");
                    String productName = scanner.next();
                    System.out.print("Input price product");
                    long productPrice =scanner.nextLong();
                    Product product = new Product(id , productName , productPrice);
                    service.addProduct(product);
                    break;
                case 2:
                    System.out.println("Input id:");
                    id = scanner.nextInt();
                    System.out.print("Input name product: ");
                    productName = scanner.next();
                    System.out.println("Input price :");
                    long price =scanner.nextLong();
                    service.setProduct(id, productName,price);
                    break;
                case 3:
                    System.out.println("Input id :");
                    id = scanner.nextInt();
                    service.removeProduct(id);
                    break;
                case 4:
                    List<Product> productList = service.findAll();
                    for (Product products : productList){
                        System.out.println(products);
                    }
                    break;
                case 5:
                    System.out.println("Input name product :");
                    productName = scanner.nextLine();
                    service.findProductName(productName);
                    break;
                case 6:
                    service.sortAscending();
                    break;
                case 7:
                    service.sortDescending();
                    break;
                case 8:
                    System.exit(0);
            }
    }while (true);
}

}
