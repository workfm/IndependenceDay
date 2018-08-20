package SydneyCBD;

import MelbourneCBD.CBD;

public class Sydney extends CBD{

    public static void main(String args[]){

        //CBD vCBD = new CBD(); //can't access private, need to create object of this class which is Sydney

        Sydney varSydney = new Sydney();

        System.out.println(varSydney.publicVariable);
        System.out.print(varSydney.protectedVariable);



    }
}
