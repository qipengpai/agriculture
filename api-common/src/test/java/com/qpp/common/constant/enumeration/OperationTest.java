package com.qpp.common.constant.enumeration;

import com.qpp.common.constant.enums.Operation;

/**
 * @ClassName OperationTest
 * @Description TODO 操作运算
 * @Author qipengpai
 * @Date 2019/2/22 22:30
 * @Version 1.0.1
 */
public class OperationTest {

    public static void main(String[] args) {
        double x = 1.236;
        double y = 3.142;
        for (Operation operation:Operation.values()) {
            System.out.printf("%f %s %f = %f",x,operation,y,operation.apply(x,y));
            System.out.printf("     ---    %s属于%s%n",operation.toString(),Operation.fromString(operation.toString()));
        }
    }
}
