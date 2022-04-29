package neros2k.solid.srp.bad;
import neros2k.solid.srp.DataObject;
import java.util.Arrays;
public class Class {
    void sendMessages(DataObject DATA_OBJECT) {
        DATA_OBJECT.send("SPAM!!!");
        DATA_OBJECT.send("Not spam");
    }
    void printMessages(DataObject DATA_OBJECT) {
        System.out.println(Arrays.toString(this.filterMessages(DATA_OBJECT)));
    }
    String[] filterMessages(DataObject DATA_OBJECT) {
        return (String[]) DATA_OBJECT.getList().stream().filter((CONTENT) -> !CONTENT.equals("SPAM!!!")).toArray();
    }
}
