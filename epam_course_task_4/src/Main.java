import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.initGoods();

        //Фільтрування
        Search search = new Search();
        search.searchByType(shop.getGoods(),"   offices ");

        //Сортування
        Collections.sort(search.getSearchedList(),new Sort());
        for (Stationery s: search.getSearchedList()) {
            System.out.print(s);
        }

    }
}
