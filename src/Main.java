package src;
import java.util.*;

public class Main {
    private static LinkedList<ToyShop> toys = new LinkedList<>();

    public static void main(String[] args) {

        ToyShop toyShop = new ToyShop("Base");
        toyShop.addToyToShop(1, "Мишка",1,5);
        toyShop.addToyToShop(2, "Собачка",1,10);
        toyShop.addToyToShop(3, "Заяц",1,15);
        toyShop.addToyToShop(4, "Чебурашка",1,20);
        toyShop.addToyToShop(5, "Погремушка",1,25);
        toys.add(toyShop);

//        toyShop = new ToyShop("All toys");
//
//        toyShop.addToyToShop(1, "Чебурашка",1,1);
//        toyShop.addToyToShop(2, "Неваляшка",1,1);
//        toyShop.addToyToShop(3, "Погремушка",1,1);
//        toyShop.addToyToShop(4, "Чебурашка",1,1);
//
//        toys.add(toyShop);

        LinkedList<Toy>toyList1 = new LinkedList<>();

        toys.get(0).addToLotteryList("Чебурашка", toyList1);
        toys.get(0).addToLotteryList("Погремушка", toyList1);
        toys.get(0).addToLotteryList("Заяц", toyList1);
        //toyList1.remove(1);
        //List<Toy> toysInList
        //System.out.println(toyList1);
        // toyShop.showToyShopList(toys);
        //toyShop.showToyLotteryList(toyList1);
        //printMenu();
        start(toyList1);

        //
        // new ToyShop("Lottery").addToLotteryList("Заяц", toyList1 );

    }

    public static void start(LinkedList<Toy>toyList1) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        printMenu();
        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();
            switch (action){
                case 0:
                    System.out.println("Досвидос");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Список магазина");
                    ToyShop.showToyShopList(toys);
                    break;
                case 2:
                    System.out.println("Список розыгрыша");
                    ToyShop.showToyLotteryList(toyList1);
                    break;
                case 3:
                    System.out.println("ВВедите назвние игрушки, которую хотите перместить в сапсок розыгрыша :");
                    String name = sc.nextLine();
                    //new ToyShop("Lottery").addToLotteryList(name,LotteryList );
                    toys.get(0).addToLotteryList(name, toyList1);
                    break;
                case 4 :
                    System.out.println("Sorry this function is not avaylable");
                    break;
                case 5:
                    ToyShop.putToyToPrizeToysQueue();
                    ToyShop.getPrizeToyAndWrite("prizes.txt" );
            }
        }

    }
    public static void printMenu(){
        System.out.println("0 - Выход\n " +
                "1 - Посмотреть список магазина\n " +
                "2 - Посмотреть список на розыгрыш\n" +
                "3 - Переместить из списка маганина в список розыгрыш\n"+
                "4 - Удалить игрушку из списка розыгрыша\n" +
                "5 - Провести розыгрыш\n" +
                "6 - Забрать призовую игрушку");
    }

}
