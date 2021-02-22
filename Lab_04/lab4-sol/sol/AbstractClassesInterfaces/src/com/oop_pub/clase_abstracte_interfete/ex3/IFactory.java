package com.oop_pub.clase_abstracte_interfete.ex3;

import com.oop_pub.clase_abstracte_interfete.ex2.Container;

public interface IFactory {

    /**
     * Creates a Container which implements the strategy given as a parameter.
     *
     * @param strategy The required Strategy.
     * @return a Container which respects the strategy given as a parameter.
     */
    Container createContainer(Strategy strategy);
}
