package poly;

public class Bus implements Transport {
    /**
     * Стоимость топлива.
     */
    private double cost;

    public Bus(double cost) {
        this.cost = cost;
    }

    @Override
    public void go() {
        System.out.println("Go");
    }

    @Override
    public void passengers(int quantityPassengers) {
        System.out.println("Quantity passengers = " + quantityPassengers);
    }

    @Override
    public double fillUp(int fuelQuantity) {
        return this.cost * fuelQuantity;
    }

    public static void main(String[] args) {
        Bus bus = new Bus(1);
        bus.go();
        bus.passengers(20);
        System.out.println("Cost fuel = " + bus.fillUp(100) + "$");
    }
}
