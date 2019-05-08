# spring-boot-traditional-web
SPRING BOOT中实现传统WEB项目中的filter/listener/servlet

servlet、filter、listener是配置到web.xml中（web.xml 的加载顺序是：context-param -> listener -> filter -> servlet ），interceptor不配置到web.xml中，struts的拦截器配置到struts.xml中。spring的拦截器配置到spring.xml中。 