package com.qpp.common.constant.enumeration;

import com.qpp.common.constant.enums.PayrollDay;

/**
 * @ClassName PayrollDayTest
 * @Description TODO
 * @Author qipengpai
 * @Date 2019/3/23 22:00
 * @Version 1.0.1
 */
public class PayrollDayTest {

//    public static void main(String[] args) {
//        double hoursWorks = 8d;
//        double payRate = 600d;
//        for (PayrollDay payrollDay:PayrollDay.values()) {
//            System.out.printf("%s 的工资是--%f%n",payrollDay,payrollDay.pay(hoursWorks,payRate));
//        }
//    }

    public static void main(String[] args) {
        double [] hoursWorks = new double[]{8d,11d,13d,15d,8d};
        double payRate = 600d;
        PayrollDay[] payrollDays = PayrollDay.values();
        for (int i = 0; i < hoursWorks.length; i++) {
            System.out.printf("%s 的工资是--%f%n",payrollDays[i],payrollDays[i].pay(hoursWorks[i],payRate));
        }

    }
}
