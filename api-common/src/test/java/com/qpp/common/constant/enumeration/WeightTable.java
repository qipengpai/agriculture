package com.qpp.common.constant.enumeration;

import com.qpp.common.constant.enums.Planet;

/**
 * @ClassName WeightTable
 * @Description TODO 行星质量
 * @Author qipengpai
 * @Date 2019/2/22 21:37
 * @Version 1.0.1
 */
public class WeightTable {

    public static void main(String[] args) {
        double earthWeight = 5.95e+25;
        double mass =  earthWeight / Planet.EARTH.getSurfaceGravity();
        for (Planet planet:Planet.values()) {
            System.out.printf("Weight on %s is %f%n",planet,planet.surfaceWeight(mass));
        }
    }
}
