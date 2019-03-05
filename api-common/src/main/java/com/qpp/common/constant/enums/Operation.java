package com.qpp.common.constant.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Operation
 * @Description TODO 加减乘除枚举
 * @Author qipengpai
 * @Date 2019/2/22 22:19
 * @Version 1.0.1
 */
public enum Operation {
    PLUS("+"){
        public double apply(double x,double y){
            return x + y;
        }
    },
    MINUS("-"){
        public double apply(double x,double y){
            return x - y;
        }
    },
    TIMES("*"){
        public double apply(double x,double y){
            return x * y;
        }
    },
    DIVIDE("/"){
        public double apply(double x,double y){
            return x / y;
        }
    };


    private final String symbol;
    public abstract double apply(double x,double y);

    Operation(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }


    private static final Map<String,Operation> operationMap = new HashMap<>();

    static {
        for (Operation operation:values()) {
            operationMap.put(operation.toString(),operation);
        }
    }

    public static Operation fromString(String symbol){
        return operationMap.get(symbol);
    }
    
    /**
     * @Author qipengpai
     * @Description //TODO 相反运算
     * @Date 2019/2/22 23:10
     * @Param [operation] 
     * @return com.qpp.common.constant.enums.Operation
     * @throws 
     **/
    public static Operation inverse(Operation operation){
        switch (operation) {
            case PLUS: return MINUS;
            case MINUS: return PLUS;
            case TIMES: return DIVIDE;
            case DIVIDE: return TIMES;
            default: throw new AssertionError("UNKNOWN OPERATION: "+operation);
        }
    }
}
