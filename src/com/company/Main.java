package com.company;

import com.company.entities.Item;
import com.company.entities.Order;
import com.company.entities.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static LocalDateTime dataInicio;
    public static LocalDateTime dataFim;
    public static List<Order> orderList = new ArrayList<>();
    public static List<Item> itemList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        //2018-01-01 00:00:00
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        initDatabase();

        System.out.println("Data de Inicio");
        dataInicio = LocalDateTime.parse(myObj.nextLine(), dataFormatada);

        System.out.println("Data de Fim");
        dataFim = LocalDateTime.parse(myObj.nextLine(), dataFormatada);

        //System.out.println(dataInicio +" " + dataFim);
        System.out.println("Number of orders - " + orderCount(dataInicio, dataFim));

    }

    private static String orderCount(LocalDateTime dataInicio, LocalDateTime dataFim){
        final int[] count1 = {0};
        final int[] count2 = {0};
        final int[] count3 = {0};
        final int[] count4 = {0};

        orderList.forEach(order -> {
            if (order.getItems().stream().anyMatch(item -> item.getProduct().getCreationDate().isAfter(dataInicio)
                    && item.getProduct().getCreationDate().isBefore(dataFim))) {

                int monthsBetween =
                        Period.between(order.getDate_time().toLocalDate(),
                                LocalDate.now()).getMonths();

                if(monthsBetween >= 0 && monthsBetween<= 3){
                    count1[0] = count1[0] +1;
                } else if (monthsBetween >= 4 && monthsBetween<= 6){
                    count2[0] = count2[0] +1;
                } else if (monthsBetween >= 7 && monthsBetween<= 12 ) {
                    count3[0] = count3[0] +1;
                } else if (monthsBetween > 12) {
                    count4[0] = count4[0] +1;
                }

            }
        });

        return "1-3 meses " + Arrays.toString(count1) + "\n" +
                "4-6 meses " + Arrays.toString(count2) + "\n" +
                "7-12 meses " + Arrays.toString(count3) + "\n" +
                "12+ meses " + Arrays.toString(count4) + "\n";
    }

    private static void initDatabase (){



        Product product = new Product("produto", "categoria",1,10,
                LocalDateTime.of(2020, Month.JANUARY, 8, 12, 30));

        Product product2 = new Product("produto2", "categoria",1,10,
                LocalDateTime.of(2020, Month.JANUARY, 8, 12, 30));

        Product product3 = new Product("produto3", "categoria",1,10,
                LocalDateTime.of(2020, Month.JANUARY, 8, 12, 30));

        Item item = new Item(10, 0, 0, product);
        itemList.add(item);

        Order order = new Order("Rodrigo",911111111
               ,"Rua de cima 123",20,
                LocalDateTime.of(2020, Month.APRIL, 13, 15, 30), itemList);

        orderList.add(order);

        Item item2 = new Item(10, 0, 0, product);
        itemList.add(item2);

        Order order2 = new Order("Marlene",911111110
                ,"Rua de cima 132",20,
                LocalDateTime.of(2020, Month.JUNE, 20, 16, 30), itemList);

        orderList.add(order2);

        Item item3 = new Item(10, 0, 0, product2);
        itemList.add(item3);

        Order order3= new Order("João",911111112
                ,"Rua de cima 312",20,
                LocalDateTime.of(2020, Month.OCTOBER, 5, 17, 30), itemList);

        orderList.add(order3);

        Item item4 = new Item(10, 0, 0, product3);
        itemList.add(item4);

        Order order4 = new Order("Rute",911111113
                ,"Rua de cima 213",20,
                LocalDateTime.of(2021, Month.JANUARY, 1, 18, 30), itemList);

        orderList.add(order4);

        Item item5 = new Item(10, 0, 0, product3);
        itemList.add(item5);

        Order order5 = new Order("Joana",911111114
                ,"Rua de cima 231",20,
                LocalDateTime.of(2021, Month.APRIL, 8, 19, 30), itemList);

        orderList.add(order5);

       // LocalDateTime dateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);
    }
}
