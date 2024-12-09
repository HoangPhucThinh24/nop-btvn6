package lesson6_abstract.Transport;

public class Plane extends Vehicle {

    @Override
    public double caculateTime(double s) {
        return s/Constant.V_PLANE;
    }
}
