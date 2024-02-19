package jsonoutput;

public class PhoneNumber {

    private final int areaCode;
    private final int prefix;
    private final int lineNumber;

    public PhoneNumber(String phoneInfo) {
        String[] phoneStringArray = phoneInfo.split("-");

        this.areaCode = Integer.parseInt(phoneStringArray[0]);
        this.prefix = Integer.parseInt(phoneStringArray[1]);
        this.lineNumber = Integer.parseInt(phoneStringArray[2]);
    }

    @Override
    public String toString() {
        return ("(" + areaCode + ") " + prefix + "-" + lineNumber);
    }

}
