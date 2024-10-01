package com.seyedex.nexus.converter;

public interface Converter<T, U> {

    U convert(T t);

}
