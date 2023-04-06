//package com.atguigu.spring5;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//import java.util.Arrays;
//
//public class JDKProxy {
//    public static void main(String[] args) {
//        // 创建接口代理类的对象
//        Class[] interfaces = {UserDao.class};
////        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
////            @Override
////            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
////                return null;
////            }
////        });
//        UserDaoImpl userDao = new UserDaoImpl();
//        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,
//                new UserDaoProxy(userDao));
//        int res = dao.add(1, 2);
//        System.out.println("result:"+res);
//    }
//}
//
//class UserDaoProxy implements InvocationHandler{
//    // 有参构造传递代理对象
//    private Object obj;
//    public UserDaoProxy(Object obj){
//        this.obj = obj;
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//        System.out.println("之前"+method.getName()+":传递的参数..."+Arrays.toString(args));
//
//        Object res = method.invoke(obj, args);
//
//        System.out.println("之后"+obj);
//
//        return res;
//    }
//}
//
//
