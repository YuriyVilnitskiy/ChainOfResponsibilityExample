/**
 * Created by jlaba on 24.12.2016.
 */
public class ATM {
    /**
     * Take care about order of bills
     */
    int money;

    public ATM(int money){
        this.money = money;
    }

    public void moneyGiving(){
        DollarsDispenser50 d50 = new DollarsDispenser50();
        DollarsDispenser20 d20 = new DollarsDispenser20();
        DollarsDispenser10 d10 = new DollarsDispenser10();
        d50.setNext(d20);
        d20.setNext(d10);
        Currency currency = new Currency(money);
        d50.getAmount(currency);



    }
}
