package com.sunjian.factory;

import com.sunjian.entity.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂
 * @author sunjian
 * @date 2020/3/14 14:38
 */
public class StaticCarFactory {
    private static Map<Integer, Car> map;
    static {
        map = new HashMap<Integer, Car>();
        map.put(1, new Car(1, "起亚K2"));
        map.put(2, new Car(2, "起亚K5"));
    }

    public static Car getCar(Integer id){
        return map.get(id);
    }
}
