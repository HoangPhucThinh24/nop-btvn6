package lesson6_abstract.Transport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap quang duong (km)");
        double s = Double.parseDouble(scanner.nextLine());

        Bus bus = new Bus();
        Train train = new Train();
        Plane plane = new Plane();

        System.out.println("thoi gian den noi bang xe bus: "+bus.caculateTime(s)+" gio");
        System.out.println("thoi gian den noi bang tau hoa: "+train.caculateTime(s)+" gio");
        System.out.println("thoi gian den noi bang may bay: "+plane.caculateTime(s)+" gio");
    }
}
