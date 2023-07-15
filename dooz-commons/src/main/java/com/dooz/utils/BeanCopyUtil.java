package com.dooz.utils;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ayachi Nene
 */
public class BeanCopyUtil {

    public static <T> T beanCopy(Object source, Class<T> clazz) {

        if(source == null || clazz == null){
            return null;
        }
        try {
            T target = clazz.getDeclaredConstructor().newInstance();
            BeanUtils.copyProperties(source, target);
            return target;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> beansCopy(List<?> list, Class<T> clazz) {

        if(list == null){
            return null;
        }

        return list.stream()
                .map(iter -> beanCopy(iter, clazz))
                .collect(Collectors.toList());
    }
}
