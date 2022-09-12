package org.training.advanced.navigation;

public class Car {
    private String name;
    private Integer speed;

    public void forward(int m) {
        System.out.println("Araba " + m + " metre ileri gitti");
    }

    public void makeTea() {
        System.out.println("Çay yaptım");
    }

    public void rideHorse() {
        System.out.println("Atla gezi");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
