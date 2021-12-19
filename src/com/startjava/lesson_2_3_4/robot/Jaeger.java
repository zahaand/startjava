package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private int launchedYear;
    private String mark;
    private boolean status;
    private String origin;
    private int height;
    private double weight;
    private int speed;
    private int streinghtTons;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(int launchedYear, String mark, boolean status, String origin, int height, double weight, int speed, int streinghtTons, int armor) {
        this.launchedYear = launchedYear;
        this.mark = mark;
        this.status = status;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.streinghtTons = streinghtTons;
        this.armor = armor;
    }

    public int getLaunchedYear() {
        return launchedYear;
    }

    public void setLaunchedYear(int launchedYear) {
        this.launchedYear = launchedYear;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStreinghtTons() {
        return streinghtTons;
    }

    public void setStreinghtTons(int streinghtTons) {
        this.streinghtTons = streinghtTons;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void greet() {
        System.out.println(mark + " is here!\nI'm from " + origin + "\nMy launched year is " + launchedYear);
    }

    public void saySpecification() {
        System.out.println("My height: " + height);
        System.out.println("My weight: " + weight);
        System.out.println("My armor: " + armor);
    }

    public void fly() {
        System.out.println(mark + " flies in the sky! Speed: " + speed);
    }

    public void killKaiju() {
        System.out.println("One more enemy kill!");
    }

    public void liftWeights() {
        System.out.println("Look at me! I can lift " + streinghtTons + " tons!");
    }
}