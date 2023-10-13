package less6.dz6;


import less6.sem.Cat;

import java.util.*;

public class Main {
    /*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
     Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии)
    фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
    Например:
    Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    Далее нужно запросить минимальные значения для указанных
    критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
    Работу сдать как обычно ссылкой на гит репозиторий     */
    public static void main(String[] args) {

        Set<Laptop> set = new HashSet<>();

        Laptop laptop1 = new Laptop();
        laptop1.setManufacturer("Тьюринг");
        laptop1.setModel("11");
        laptop1.setColor("black");
        laptop1.setHdd(256);
        laptop1.setRam(4);
        laptop1.setOperatingSystem("без ОС");

        /*Laptop laptop6 = new Laptop();
        laptop6.setManufacturer("Тьюринг");
        laptop6.setModel("1983");
        laptop6.setColor("black");
        laptop6.setHdd(256);
        laptop6.setRam(8);
        laptop6.setOperatingSystem("без ОС"); */

        Laptop laptop2 = new Laptop();
        laptop2.setManufacturer("Гослинг");
        laptop2.setModel("1994");
        laptop2.setColor("white");
        laptop2.setHdd(512);
        laptop2.setRam(8);
        laptop2.setOperatingSystem("без ОС");

       /* Laptop laptop7 = new Laptop();
        laptop7.setManufacturer("Гослинг");
        laptop7.setModel("1989");
        laptop7.setColor("black");
        laptop7.setHdd(512);
        laptop7.setRam(8);
        laptop7.setOperatingSystem("без ОС");*/

        Laptop laptop3 = new Laptop();
        laptop3.setManufacturer("Торвальдс");
        laptop3.setModel("1991");
        laptop3.setColor("white");
        laptop3.setHdd(512);
        laptop3.setRam(8);
        laptop3.setOperatingSystem("Linux");

        /*Laptop laptop8 = new Laptop();
        laptop8.setManufacturer("Торвальдс");
        laptop8.setModel("1991m");
        laptop8.setColor("silver");
        laptop8.setHdd(1024);
        laptop8.setRam(16);
        laptop8.setOperatingSystem("Linux");*/


        Laptop laptop4 = new Laptop();
        laptop4.setManufacturer("Гейтс");
        laptop4.setModel("1975");
        laptop4.setColor("white");
        laptop4.setHdd(1024);
        laptop4.setRam(16);
        laptop4.setOperatingSystem("Windows");

        /*Laptop laptop9 = new Laptop();
        laptop9.setManufacturer("Гейтс");
        laptop9.setModel("1975m");
        laptop9.setColor("white");
        laptop9.setHdd(2048);
        laptop9.setRam(32);
        laptop9.setOperatingSystem("Windows");*/


        Laptop laptop5 = new Laptop();
        laptop5.setManufacturer("Джобс");
        laptop5.setModel("1975");
        laptop5.setColor("white");
        laptop5.setHdd(1024);
        laptop5.setRam(16);
        laptop5.setOperatingSystem("macOS");

       /* Laptop laptop10 = new Laptop();
        laptop10.setManufacturer("Джобс");
        laptop10.setModel("1975m");
        laptop10.setColor("white");
        laptop10.setHdd(2048);
        laptop10.setRam(32);
        laptop10.setOperatingSystem("macOS");
      */
        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);
        set.add(laptop5);
//        set.add(laptop6);
//        set.add(laptop7);
//        set.add(laptop8);
//        set.add(laptop9);
//        set.add(laptop10);

        Map<Integer, String> criteria = new HashMap<>();
        laptopMenu(criteria);

        for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
            System.out.println(entry.getKey() + " фильтр: " + entry.getValue());
        }
        Set<Laptop> filtredSet = new HashSet<>();

       for (Laptop laptop : set) {
            if ((criteria.get(1)==null |laptop.getManufacturer().equals(criteria.get(1))) &&
                    (criteria.get(2)==null || laptop.getRam().intValue() >= Integer.parseInt(criteria.get(2))) &&
                    (criteria.get(3)==null || laptop.getHdd().intValue() >= Integer.parseInt(criteria.get(3))) &&
                    (criteria.get(4)==null || laptop.getOperatingSystem().equals(criteria.get(4))) &&
                    (criteria.get(5)==null || laptop.getColor().equals(criteria.get(5)))){
                filtredSet.add(laptop);
            }
        }

        Iterator iterator = filtredSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static Map<Integer, String> laptopMenu(Map<Integer, String> criteria) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "     1 - Производитель\n" +
                "     2 - ОЗУ\n" +
                "     3 - Объем ЖД\n" +
                "     4 - Операционная система\n" +
                "     5 - Цвет\n" +
                "     6 - Поиск\n" +
                "     другие цифры - Выход");
        System.out.printf("Выбор: ");
        int choice = iScanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите производителя (Тьюринг,Гослинг, Торвальдс, Гейтс, Джобс): ");
                iScanner.nextLine();
                String clientMan = iScanner.nextLine();
                criteria.put(1, clientMan);

                System.out.println();
                laptopMenu(criteria);
                break;

            case 2:
                System.out.println("Введите минимальное значение ОЗУ, которое вас интересует (от 4 до 32): ");
                iScanner.nextLine();
                String clientRam = iScanner.nextLine();
                criteria.put(2, clientRam);
                System.out.println();
                laptopMenu(criteria);
                break;

            case 3:
                System.out.println("Введите минимальное значение объема жесткого диска(от 256гБ до 2048 гБ): ");
                iScanner.nextLine();
                String clientHdd = iScanner.nextLine();
                criteria.put(3, clientHdd);
                System.out.println();
                laptopMenu(criteria);
                break;

            case 4:
                System.out.printf("Введите ОС(без ОС, macOS, Linux, Windows): ");
                iScanner.nextLine();
                String clientOS = iScanner.nextLine();
                criteria.put(4, clientOS);
                System.out.println();
                laptopMenu(criteria);
                break;

            case 5:
                System.out.printf("Введите цвет(white, silver, black) : ");
                iScanner.nextLine();
                String clientColor = iScanner.nextLine();
                criteria.put(5, clientColor);
                System.out.println();
                laptopMenu(criteria);
                break;
            case 6:
                return criteria;
            default:
                break;
        }
        iScanner.close();
        return criteria;
    }
}
