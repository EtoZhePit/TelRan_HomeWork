package homework.controller;

import homework.model.Food;
import homework.model.MeatFood;
import homework.model.MilkFood;
import homework.model.Product;

public class StoreAppl {
    public static void main(String[] args) {
        Product[] allProducts = {
                // Basic Products
                new Product("Shampoo Head&Shoulders", 5.99, 100000000001L),
                new Product("Notebook 96 pages", 1.49, 100000000002L),
                new Product("Duracell AA Batteries", 3.89, 100000000003L),
                new Product("Dove Soap", 2.19, 100000000004L),
                new Product("Hair Dye Palette", 7.99, 100000000005L),
                new Product("Oral-B Toothbrush", 4.25, 100000000006L),

                // Foods
                new Food("Wheat Bread", 1.20, 200000000001L, true, "2025-06-01"),
                new Food("Gala Apples", 2.50, 200000000002L, true, "2025-05-20"),
                new Food("Red October Candies", 3.40, 200000000003L, false, "2025-12-01"),
                new Food("Milka Chocolate", 2.10, 200000000004L, true, "2025-10-15"),
                new Food("Cashew Nuts", 4.90, 200000000005L, true, "2026-01-01"),
                new Food("Natural Honey", 5.75, 200000000006L, true, "2027-01-01"),

                // MeatFoods
                new MeatFood("Chicken Fillet", 6.30, 300000000001L, true, "2025-05-15", "Chicken"),
                new MeatFood("Beef Steak", 10.50, 300000000002L, false, "2025-05-18", "Beef"),
                new MeatFood("Boiled Sausage", 4.20, 300000000003L, false, "2025-06-10", "Pork"),
                new MeatFood("Mixed Minced Meat", 5.10, 300000000004L, true, "2025-05-17", "Beef and Pork"),
                new MeatFood("Bacon", 6.70, 300000000005L, false, "2025-05-25", "Pork"),
                new MeatFood("Turkey Thigh", 7.90, 300000000006L, true, "2025-05-21", "Turkey"),

                // MilkFoods
                new MilkFood("Milk 3.2% Fat", 1.20, 400000000001L, true, "2025-05-18", "Cow", 3.2),
                new MilkFood("Parmesan Cheese", 5.60, 400000000002L, false, "2025-09-01", "Cow", 32.0),
                new MilkFood("Danone Yogurt", 1.80, 400000000003L, true, "2025-06-01", "Cow", 2.5),
                new MilkFood("Kefir 1%", 1.10, 400000000004L, true, "2025-05-20", "Cow", 1.0),
                new MilkFood("Soft Cottage Cheese", 2.30, 400000000005L, true, "2025-05-22", "Cow", 5.0),
                new MilkFood("Sour Cream 20%", 1.95, 400000000006L, true, "2025-05-28", "Cow", 20.0)
        };

        displayProducts(allProducts);
        System.out.println("==================================");
        displaySummaryOfKosher(allProducts);
        System.out.println("==================================");
        displaySummaryOfNonKosher(allProducts);

    }

    private static double displaySummaryOfNonKosher(Product[] allProducts) {
        double sum = 0;
        for (int i = 0; i < allProducts.length; i++) {
            if (allProducts[i] instanceof Food) {
                    Food food = (Food) allProducts[i];
                    if (!food.isKosher()) {
                        sum += food.getPrice();
                    }
            }
        }
        System.out.println("Sum of Non-Kosher Foods: " + sum + "₪");;
        return sum;
    }

    private static double displaySummaryOfKosher(Product[] allProducts) {
        double sum = 0;
        for (int i = 0; i < allProducts.length; i++) {
            if (allProducts[i] instanceof Food) {
                if (((Food) allProducts[i]).isKosher()) {
                    Food food = (Food) allProducts[i];
                    if (food.isKosher()) {
                        sum += food.getPrice();
                    }
                }
            }
        }
        System.out.println("Sum of Kosher Foods: " + sum + "₪");;
        return sum;
    }

        private static void displayProducts (Product[]allProducts){
            for (int i = 0; i < allProducts.length; i++) {
                System.out.println(allProducts[i]);

            }
        }
    }

