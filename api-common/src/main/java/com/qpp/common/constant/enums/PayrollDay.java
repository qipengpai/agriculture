package com.qpp.common.constant.enums;

/**
 * @ClassName PayrollDay
 * @Description TODO 工资日枚举
 * @Author qipengpai
 * @Date 2019/2/22 22:52
 * @Version 1.0.1
 */
public enum PayrollDay {

    MONDAY(PayType.WEEKDAY),
    TUESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY),
    THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKEND),
    SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }
    double pay(double hoursWorks,double payRate){
        return payType.pay(hoursWorks,payRate);
    }

    private enum PayType{

        WEEKDAY{
            @Override
            double overtimePay(double hoursWorks, double payRate) {
                return hoursWorks <= HOURS_PER_SHIFT ? 0 :
                        (hoursWorks - HOURS_PER_SHIFT) * payRate / 2 ;
            }
        },
        WEEKEND{
            @Override
            double overtimePay(double hoursWorks, double payRate) {
                return hoursWorks * payRate / 2;
            }
        };

        private static final int HOURS_PER_SHIFT = 8;

        abstract double overtimePay(double hoursWorks,double payRate);

        double pay(double hoursWorks,double payRate){
            double basePay = hoursWorks * payRate;
            return basePay + overtimePay(hoursWorks,payRate);
        }
    }
}
