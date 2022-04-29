package neros2k.solid.lsp.bad;
public class CoolValidator extends Validator {
    @Override
    public boolean isValid(String STR) {
        if(STR.equals("VALID") || STR.equals("COOL")) {
            throw new IllegalStateException();
        } return false;
    }
}
