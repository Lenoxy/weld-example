package net.lenoxy.examples.weld;

import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldJunit5Extension;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(WeldJunit5Extension.class)
class SomeCDIBeanTest{
    @WeldSetup
    public WeldInitiator weld = WeldInitiator.of(SomeCDIBean.class);

    @Test
    void testSomeCDIBean(SomeCDIBean someCDIBean){
        System.out.println("someCDIBean.sayHello() = " + weld.select(SomeCDIBean.class).get().sayHello());
    }

}
