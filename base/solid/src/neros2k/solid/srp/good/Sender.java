package neros2k.solid.srp.good;
import neros2k.solid.srp.DataObject;
public class Sender {
    static void sendMessages(DataObject DATA_OBJECT) {
        DATA_OBJECT.send("SPAM!!!");
        DATA_OBJECT.send("Not spam");
    }
}
