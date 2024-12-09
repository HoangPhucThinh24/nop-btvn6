package lesson6_abstract.Transport;

public class Bus extends Vehicle {

    @Override
    public double caculateTime(double s) {
        return s/Constant.V_BUS;
    }
}
