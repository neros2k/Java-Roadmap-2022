package neros2k.solid.srp;
import java.util.ArrayList;
public class DataObject {
    ArrayList<String> MESSAGE_LIST = new ArrayList<>();
    public void send(String STR) {
        this.MESSAGE_LIST.add(STR);
    }
    public ArrayList<String> getList() {
        return this.MESSAGE_LIST;
    }
}
