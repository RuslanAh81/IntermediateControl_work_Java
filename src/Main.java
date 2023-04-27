package src;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static LinkedList<ToyShop> toys = new LinkedList<>();

    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop("Base");
        toyShop.addToyToShop(1, "Мишка",1,1);
        toyShop.addToyToShop(2, "Собачка",1,1);
        toyShop.addToyToShop(3, "Заяц",1,1);
        toyShop.addToyToShop(4, "Чебурашка",1,1);
        toys.add(toyShop);

        toyShop = new ToyShop("All toys");

        toyShop.addToyToShop(1, "Чебурашка",1,1);
        toyShop.addToyToShop(2, "Неваляшка",1,1);
        toyShop.addToyToShop(3, "Погремушка",1,1);
        toyShop.addToyToShop(4, "Чебурашка",1,1);

        toys.add(toyShop);

        LinkedList<Toy>toyList1 = new LinkedList<>();

        toys.get(0).addToLotteryList("Чебурашка", toyList1);
        toys.get(1).addToLotteryList("Погремушка", toyList1);
        toys.get(0).addToLotteryList("Заяц", toyList1);
        //List<Toy> toysInList
        //System.out.println(toys.toString());

//        LinkedList<Toy>toyList_1 = new LinkedList<>();
//        toys.get(0).addToyToShop("Мишка",toyList_1);
//        toys.get(0).addToyToShop("Собачка",toyList_1);
//        toys.get(1).addToLotteryList("Чебурашка",toyList_1);
//        toys.get(1).addToLotteryList("Неваляшка",toyList_1);
//        toys.get(1).addToLotteryList("Погремушка",toyList_1);
        //System.out.println(toys.get(0).toString());
        toyShop.showToyShopList(toys);
        toyShop.showToyLotteryList(toyList1);
    }

//    public static void showToyShopList(LinkedList<Toy>toyList){
//        Iterator<Toy> iterator = toyList.iterator();
//        System.out.println("____");
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println("----");
//    }
}
