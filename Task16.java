public class Task16 {

}

interface Animal{
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal{

    @Override
    public boolean feed(boolean timeToEat) {
        return false;
        //put gorilla food into cage
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
    }

    @Override
    public void pet() {
        //pet at your own risk
    }
}
