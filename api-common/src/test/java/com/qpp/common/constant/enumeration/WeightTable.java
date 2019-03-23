package com.qpp.common.constant.enumeration;

import com.qpp.common.constant.enums.Planet;
import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName WeightTable
 * @Description TODO 行星质量
 * @Author qipengpai
 * @Date 2019/2/22 21:37
 * @Version 1.0.1
 */
public class WeightTable {

    /*public static void main(String[] args) {
        double earthWeight = 5.95e+25;
        double mass =  earthWeight / Planet.EARTH.getSurfaceGravity();
        for (Planet planet:Planet.values()) {
            System.out.printf("Weight on %s is %f%n",planet,planet.surfaceWeight(mass));
        }
    }*/
    public static void main(String[] args) {
        double earthWeight = 70;
        double mass =  earthWeight / Planet.EARTH.getSurfaceGravity();
        assert ArrayUtils.isEmpty(Planet.values());
        Arrays.asList(Planet.values()).forEach( planet ->
            System.out.printf("Weight on %s is %f%n",planet,planet.surfaceWeight(mass))
        );

    }
}
