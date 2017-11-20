package com.service.controller;

import com.service.model.Person;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestZhangchunxiao {

    ZhangchunxiaoImpl zhangchunxiaoImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        zhangchunxiaoImpl = BeanUtils.getBean("zhangchunxiaoImpl");
    }



    @Test
    public void testadd(){

        Integer expactReturnValue = null; // You should put the expect Integer type value here.

        // You should put the parameter here, in such footprint: zhangchunxiaoImpl.add(Integer a, Integer b)
        Integer returnValue = zhangchunxiaoImpl.add(null, null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHei(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: zhangchunxiaoImpl.sayHei(String name)
        String returnValue = zhangchunxiaoImpl.sayHei(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHello(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: zhangchunxiaoImpl.sayHello(String name)
        String returnValue = zhangchunxiaoImpl.sayHello(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHi(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: zhangchunxiaoImpl.sayHi(String name)
        String returnValue = zhangchunxiaoImpl.sayHi(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsaySomething(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: zhangchunxiaoImpl.saySomething(String prefix, Person user)
        String returnValue = zhangchunxiaoImpl.saySomething(null, null);

        assertEquals(expactReturnValue, returnValue);
    }

}



