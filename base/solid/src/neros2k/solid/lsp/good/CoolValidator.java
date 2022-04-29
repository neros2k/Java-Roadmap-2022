package neros2k.solid.lsp.good;
public class CoolValidator {
    public boolean isValid(String STR) {
        if(STR.equals("VALID") || STR.equals("COOL")) {
            throw new IllegalStateException();
        } return false;
    }
}
