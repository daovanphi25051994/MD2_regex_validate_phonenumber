public class TestValidate {
    public static void main(String[] args) {
        String[] arrString = new String[5];
        arrString[0] = "(84)-(0978489648)";
        arrString[1] = "(a4)-(0978489648)";
        arrString[2] = "(4)-(0978489648)";
        arrString[3] = "(84)-(02978489648)";
        arrString[4] = "(84)-(2978489648)";
        Validate validate = new Validate();
        for (String string : arrString) {
            System.out.println(validate.validatePhoneNumber(string));
        }
    }
}
