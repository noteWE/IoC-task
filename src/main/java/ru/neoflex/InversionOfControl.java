package ru.neoflex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.neoflex.service.OrderService;

/**
 * InversionOfControl.
 *
 * @author nanikeev
 */
public class InversionOfControl {

    public static void main(String... args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("context-config.xml");
        OrderService orderService = context1.getBean(OrderService.class);
        orderService.createNew(1L);

        ApplicationContext context2 = new ClassPathXmlApplicationContext("context-autowire-config.xml");
        OrderService orderService2 = context2.getBean(OrderService.class);
        orderService2.createNew(1L);

        ApplicationContext context3 = new ClassPathXmlApplicationContext("context-enable-annotations.xml");
        OrderService orderService3 = context3.getBean(OrderService.class);
        orderService3.createNew(1L);
    }
}
