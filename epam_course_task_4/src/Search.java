import java.util.ArrayList;
import java.util.List;

public class Search {

    private List<Stationery> searchedList = new ArrayList<>();

    // пошук товарів відповідно до введеного типу
    public void searchByType(List<Stationery> list,String type){

        int couter = 0;

        String formatedType = type.replace(" ","");
        String [] types = formatedType.split(",");

        if (types.length > 1) {
            for (Stationery s : list) {
                couter = 0;
                for (int i = 0; i < types.length; i++) {
                    if (s.addKindOfGoods().getKindOfGoods().toLowerCase().contains(types[i].toLowerCase())) {
                        couter++;
                        if (couter == types.length) {
                            searchedList.add(s);
                        }
                    }
                }
            }
        }else {
            for (Stationery s : list) {
                    if (s.addKindOfGoods().getKindOfGoods().toLowerCase().contains(type.trim().toLowerCase())) {
                            searchedList.add(s);
                    }
                }
            }
    }

    public List<Stationery> getSearchedList() {
        return searchedList;
    }
}
