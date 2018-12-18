public class KindOfGoods{

   private String kindOfGoods = new String();

   private StationeryForOffices stationeryForOffices;
   private StationeryForChildren stationeryForChildren;
   private StarioneryForStudents starioneryForStudents;

   //Додавання до товару типу - "канцтовари для студентів"
    public void addStarioneryForStudents() {
        this.starioneryForStudents = new StarioneryForStudents("students");
        if(kindOfGoods.isEmpty()){
            setKindOfGoods(this.kindOfGoods+ starioneryForStudents.getName());
        }else
       setKindOfGoods(this.kindOfGoods +", "+ starioneryForStudents.getName());
    }

    //Додавання до товару типу - "канцтовари для дітей"
    public void addStationeryForChildren() {
        this.stationeryForChildren = new StationeryForChildren("children");
        if (kindOfGoods.isEmpty()){
            setKindOfGoods(this.kindOfGoods+ stationeryForChildren.getName());
        }else
        setKindOfGoods(this.kindOfGoods +", "+ stationeryForChildren.getName());
    }

    //Додавання до товару типу - "канцтовари для офісу"
    public void addStationeryForOffices() {
        this.stationeryForOffices = new StationeryForOffices("offices");
        if(kindOfGoods.isEmpty()){
            setKindOfGoods(this.kindOfGoods+ stationeryForOffices.getName());
        }else
        setKindOfGoods(this.kindOfGoods + ", "+ stationeryForOffices.getName());
    }

    public String getKindOfGoods() {
        return kindOfGoods;
    }

    public void setKindOfGoods(String kindOfGoods) {
        this.kindOfGoods = kindOfGoods;
    }

    @Override
    public String toString() {
        return " kind of goods=" + kindOfGoods;
    }
}
