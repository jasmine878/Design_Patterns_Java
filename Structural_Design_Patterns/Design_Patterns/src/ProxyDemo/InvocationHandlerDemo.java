package ProxyDemo;

import java.lang.reflect.Proxy;

public class InvocationHandlerDemo {
    public static void main(String[] args) {
        CustomService customService = new CustomServiceImpl();

//        customService.doServiceCall();

        CustomInvocationHandler<CustomService> customHandler = new CustomInvocationHandler<>(customService);

        CustomService proxyService = (CustomService) Proxy.newProxyInstance(
                customService.getClass().getClassLoader(),
                new Class[] {CustomService.class},
                customHandler);

        proxyService.doServiceCall();
    }
}
