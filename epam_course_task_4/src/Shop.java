import java.util.ArrayList;
import java.util.List;

public class Shop{

    private List<Stationery> stationeryGoods;

    public Shop(){

       stationeryGoods = new ArrayList<>();

    }

    // Заповнення магазину товаром
    public void initGoods(){

        Stationery pen = new Stationery(0L,"pen","nike",1.1,Color.Blue);
        pen.addKindOfGoods().addStationeryForChildren();
        pen.addKindOfGoods().addStarioneryForStudents();
        stationeryGoods.add(pen);

        Stationery book = new Stationery(1L,"book","nike",1.1,Color.White);
        book.addKindOfGoods().addStationeryForOffices();
        book.addKindOfGoods().addStationeryForChildren();
        stationeryGoods.add(book);

        Stationery note = new Stationery(2L,"note","nike",1.1,Color.Red);
        note.addKindOfGoods().addStationeryForOffices();
        note.addKindOfGoods().addStarioneryForStudents();
        stationeryGoods.add(note);


    }

    public List<Stationery> getGoods(){
        return stationeryGoods;
    }

}
