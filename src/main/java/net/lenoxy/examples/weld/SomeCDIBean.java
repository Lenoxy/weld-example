package net.lenoxy.examples.weld;

import javax.enterprise.context.Dependent;

@Dependent
public class SomeCDIBean{

    public String sayHello(){
        return "Hello World";
    }

}
