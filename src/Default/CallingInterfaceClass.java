package Default;

public class CallingInterfaceClass implements InterfaceBanking {


    public static void main(String[] args)
    {

        CallingInterfaceClass ci = new CallingInterfaceClass();

        ci.paycreditcard();
        ci.checkingbalance();
        ci.transferbalance();
        ci.Login();

        InterfaceBanking ib = new CallingInterfaceClass();
        ib.paycreditcard();
        ib.checkingbalance();
        ib.transferbalance();
        // ib.Login(); // applying this will throw an error as Login method is only defined within CallingInterface Class but not in InterfaceBanking

    }

    @Override
    public void paycreditcard() {
            // First call these methods from InterfaceBanking-interface, then write your code here

        System.out.println("paycreditcard implemented");

    }

    @Override
    public void transferbalance() {
        System.out.println("transferbalance implemented");
    }

    @Override
    public void checkingbalance() {
        System.out.println("checkingbalance implemented");
    }

    public void Login(){

        System.out.println("login applied");
    }



}
