package com.qpp.common.constant.enums;

public enum Planet {

    MERCURY(3.302e+23,2.439e6),
    VENUS(4.869e+24,6.052e6),
    EARTH(5.975e+24,6.378e6),
    MARS(6.419e+24,3.393e6),
    JUPITER(1.899e+27,7.149e7),
    SATURN(5.685e6+26,6.027e6),
    URANUS(8.683e+25,2.556e7),
    NEPTUNE(1.024e+26,2.477e7);

    private final double mass; //质量

    private final double radius; //半径

    private final double surfaceGravity; //表面重力

    private static final double G =6.67300E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / radius * radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public double surfaceWeight(double mass){
        return  mass * surfaceGravity; //F = ma
    }

}
