package MelbourneCBD;

public class CBD {

    public int publicVariable = 10;
    protected int protectedVariable = 20;
    int defaultVariable=30;
    private int privateVariable = 40;

    public static void main(String args[]){

        CBD varCBD = new CBD();

        System.out.print(varCBD.publicVariable + " " + varCBD.protectedVariable + " " + varCBD.defaultVariable + " " + varCBD.privateVariable);
    }



}
