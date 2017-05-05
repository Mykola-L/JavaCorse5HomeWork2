package Module7.Task75;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1111, "Vasya", "Vas", "Kyiv", 10000);
        User user2 = new User(1112, "Kolya", "Kol", "Poltava", 20000);
        User user3 = new User(1113, "Vitya", "Vit", "Odessa", 30000);
        User user4 = new User(1114, "Misha", "Mis", "Kyiv", 40000);
        User user5 = new User(1115, "Olya", "Ol", "Kyiv", 10000);
        User user6 = new User(1116, "Masha", "Petrov", "Odessa", 20000);
        User user7 = new User(1117, "Sveta", "Svet", "Kyiv", 30000);
        User user8 = new User(1118, "Katya", "Kat", "Odessa", 40000);
        // duplicate users to create duplicate orders
        User user9 = user2;
        User user10 = user4;

        Order order1 = new Order(1, 5000, Currency.UAH, "Tablet PC", "Rozetka", user1);
        Order order2 = new Order(2, 300, Currency.UAH, "Cooler", "Repka", user2);
        Order order3 = new Order(3, 100, Currency.UAH, "Clay", "Kids", user3);
        Order order4 = new Order(4, 2000, Currency.UAH, "Screwdriver", "Tools", user4);
        Order order5 = new Order(5, 300, Currency.USD, "Tree", "Amazon", user5);
        Order order6 = new Order(6, 9000, Currency.USD, "Ferrari", "Ebay", user6);
        Order order7 = new Order(7, 300, Currency.USD, "Coat", "Things", user7);
        Order order8 = new Order(8, 4000, Currency.USD, "Dog", "Pets", user8);
        Order order9 = new Order(9, 300, Currency.UAH, "Cooler", "Repka", user9);
        Order order10 = new Order(10, 2000, Currency.UAH, "Screwdriver", "Tools", user10);

        Order[] orders = {order1, order2, order3, order4, order5, order6, order7, order8, order9, order10};

        List<Order> orderList = new ArrayList<>(Arrays.asList(orders));
        List<Order> originalOrderList = new ArrayList<>(orderList);                 // a copy for future use
        // print the original list
        System.out.println(orderList);

        // sort by price descending
        System.out.println("==============Sorted by price descending=============");
        orderList.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
        System.out.println(orderList);

        // sort by price ascending and city
        System.out.println("=======Sorted by price ascending and by city=========");
        orderList.sort((o1, o2) -> o1.getPrice() - o2.getPrice() == 0 ?
                o1.getUser().getCity().compareTo(o2.getUser().getCity()) :
                o1.getPrice() - o2.getPrice());
        System.out.println(orderList);

        // sort by itemName, ShopId, City - using anonymous class in the classic way
        System.out.println("======Sorted by itemName, ShopId, City===============");
        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int result = o1.getItemName().compareTo(o2.getItemName());
                if (result == 0) {
                    result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                }
                if (result == 0) {
                    result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return result;
            }
        });
        System.out.println(orderList);

        // delete duplicates
        Set<Order> orderSet = new HashSet<>(orderList);
        orderList = new ArrayList<>(orderSet);
        System.out.println("=========Duplicates removed===========");
        System.out.println(orderList);

        // delete orders with price < 1500 - using lambda
        orderList.removeIf(order -> order.getPrice() < 1500);
        System.out.println("========Removed orders < 1500==========");
        System.out.println(orderList);

        // separate lists for USD and UAH
        List<Order> uahList = new ArrayList<>(orderList);
        List<Order> usdList = new ArrayList<>();
        int i = 0;
        while (i < uahList.size()) {
            if (uahList.get(i).getCurrency() == Currency.USD) {
                usdList.add(uahList.remove(i));
            } else {
                i++;
            }
        }
        System.out.println("==============List UAH==================");
        System.out.println(uahList);
        System.out.println("==============List USD==================");
        System.out.println(usdList);

        // separate by cities
        Map<String, List<Order>> cities = new HashMap<>();
        for (Order order : originalOrderList) {
            String city = order.getUser().getCity();
            if (cities.containsKey(city)) {
                cities.get(city).add(order);
            } else {
                List<Order> temp = new ArrayList<>();
                temp.add(order);
                cities.put(city, temp);
            }
        }

        System.out.println("=========Lists separated by city=============");
        for (List<Order> list : cities.values()) {
            System.out.println(list);
        }

        // Task 7.3 starts here
        Set<Order> orderTreeSet = new TreeSet<>(originalOrderList);
        // find out if the order set contains a user with the last name Petrov
        for (Order order : orderTreeSet) {
            if (order.getUser().getLastName().equals("Petrov")) {
                System.out.println("The set of orders contains Petrov");
                break;
            }
        }
        /*
            print order with the biggest price. Task is somewhat unclear, set does not contain any 'get' method
            so we do it in two ways
         */

        // 1. use stream
        orderTreeSet.stream().max(Comparator.comparingInt(Order::getPrice))
                .ifPresent(o -> System.out.println("===========The biggest price order is:========" + o));

        // 2. use a TreeSet with a comparator to sort by price descending
        TreeSet<Order> ordersSortedByPrice = new TreeSet<>((o1, o2) -> o2.getPrice() - o1.getPrice());
        ordersSortedByPrice.addAll(orderTreeSet);
        System.out.println("========The biggest price order sorted by TreeSet:=======" + ordersSortedByPrice.first());

        // delete USD orders using iterator
        Iterator<Order> it = orderTreeSet.iterator();
        while (it.hasNext()) {
            if (it.next().getCurrency() == Currency.USD) {
                it.remove();
            }
        }
        System.out.println("============USD orders removed============");
        System.out.println(orderTreeSet);

    }
}