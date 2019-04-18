package headfirst.designpatterns.state.gumballstatewinner;


public class JackpotState implements State {

    private GumballMachine gumballMachine;
    private int gumballs = 0;

    public JackpotState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void ejectQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void turnCrank() {
        System.out.println("Turning again doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        for(int i = 0; i <= 20; i++){
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() == 0) {
                gumballMachine.setState(gumballMachine.getSoldOutState());
                break;
            } else {
                gumballMachine.releaseBall();
                gumballs++;
            }
        }
        System.out.printf("YOU'RE A WINNER! You got %d gumballs for your quarter\n", gumballs);
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {

    }

    @Override
    public void tryMyLuck() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public String toString() {
        return "despensing" + gumballs + " gumballs for your quarter, JACKPOT!! , because YOU'RE A WINNER!";
    }
}
