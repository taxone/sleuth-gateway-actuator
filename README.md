The big stack trace at startup

```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
[32m :: Spring Boot :: [39m              [2m (v2.6.7)[0;39m

[2m2022-05-18 18:16:06.309[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36me.t.k.SleuthGwApplication               [0;39m [2m:[0;39m Starting SleuthGwApplication using Java 1.8.0_281 on NBK04637 with PID 19820 (D:\git\sleuth-gw\sleuth-gw\target\classes started by tassoc in D:\git\sleuth-gw\sleuth-gw)
[2m2022-05-18 18:16:06.312[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36me.t.k.SleuthGwApplication               [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2022-05-18 18:16:07.270[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.cloud.context.scope.GenericScope    [0;39m [2m:[0;39m BeanFactory id=3cc611c0-9757-3ac0-8862-6924f1bbdd0a
[2m2022-05-18 18:16:08.932[0;39m [33m WARN [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.s.a.i.w.SkipPatternConfiguration  [0;39m [2m:[0;39m Most likely, there is an actuator endpoint that indirectly references an instrumented HTTP client. An exception was thrown during bean initialization. Will ignore that exception

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gatewayControllerEndpoint' defined in class path resource [org/springframework/cloud/gateway/config/GatewayAutoConfiguration$GatewayActuatorConfiguration.class]: Unsatisfied dependency expressed through method 'gatewayControllerEndpoint' parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'routingFilter' defined in class path resource [org/springframework/cloud/gateway/config/GatewayAutoConfiguration$NettyConfiguration.class]: Unsatisfied dependency expressed through method 'routingFilter' parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gatewayHttpClientFactory' defined in class path resource [org/springframework/cloud/gateway/config/GatewayAutoConfiguration$NettyConfiguration.class]: Unsatisfied dependency expressed through method 'gatewayHttpClientFactory' parameter 2; nested exception is org.springframework.beans.factory.BeanCurrentlyInCreationException: Error creating bean with name 'customizer': Requested bean is currently in creation: Is there an unresolvable circular reference?
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:541) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1154) ~[spring-context-5.3.19.jar:5.3.19]
	at org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer.lambda$createEndpointBean$1(EndpointDiscoverer.java:145) ~[spring-boot-actuator-2.6.7.jar:2.6.7]
	at org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer$EndpointBean.getBean(EndpointDiscoverer.java:447) ~[spring-boot-actuator-2.6.7.jar:2.6.7]
	at org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer.getFilterEndpoint(EndpointDiscoverer.java:307) ~[spring-boot-actuator-2.6.7.jar:2.6.7]
	at org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer.isFilterMatch(EndpointDiscoverer.java:285) ~[spring-boot-actuator-2.6.7.jar:2.6.7]
	at org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer.isEndpointExposed(EndpointDiscoverer.java:254) ~[spring-boot-actuator-2.6.7.jar:2.6.7]
	at org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer.convertToEndpoints(EndpointDiscoverer.java:181) ~[spring-boot-actuator-2.6.7.jar:2.6.7]
	at org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer.discoverEndpoints(EndpointDiscoverer.java:125) ~[spring-boot-actuator-2.6.7.jar:2.6.7]
	at org.springframework.boot.actuate.endpoint.annotation.EndpointDiscoverer.getEndpoints(EndpointDiscoverer.java:117) ~[spring-boot-actuator-2.6.7.jar:2.6.7]
	at org.springframework.cloud.sleuth.autoconfig.instrument.web.SkipPatternConfiguration$ActuatorSkipPatternProviderConfig.getEndpointsPatterns(SkipPatternConfiguration.java:158) ~[spring-cloud-sleuth-autoconfigure-3.1.2.jar:3.1.2]
	at org.springframework.cloud.sleuth.autoconfig.instrument.web.SkipPatternConfiguration$ActuatorSkipPatternProviderConfig.lambda$skipPatternForActuatorEndpointsSamePort$0(SkipPatternConfiguration.java:213) ~[spring-cloud-sleuth-autoconfigure-3.1.2.jar:3.1.2]
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193) ~[na:1.8.0_281]
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1384) ~[na:1.8.0_281]
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482) ~[na:1.8.0_281]
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472) ~[na:1.8.0_281]
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708) ~[na:1.8.0_281]
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:1.8.0_281]
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499) ~[na:1.8.0_281]
	at org.springframework.cloud.sleuth.autoconfig.instrument.web.SkipPatternConfiguration.consolidateSkipPatterns(SkipPatternConfiguration.java:102) ~[spring-cloud-sleuth-autoconfigure-3.1.2.jar:3.1.2]
	at org.springframework.cloud.sleuth.autoconfig.instrument.web.SkipPatternConfiguration.sleuthSkipPatternProvider(SkipPatternConfiguration.java:85) ~[spring-cloud-sleuth-autoconfigure-3.1.2.jar:3.1.2]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_281]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_281]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_281]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_281]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:154) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:653) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:638) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1389) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1309) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:541) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1389) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1309) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:541) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:953) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918) ~[spring-context-5.3.19.jar:5.3.19]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583) ~[spring-context-5.3.19.jar:5.3.19]
	at org.springframework.boot.web.reactive.context.ReactiveWebServerApplicationContext.refresh(ReactiveWebServerApplicationContext.java:64) ~[spring-boot-2.6.7.jar:2.6.7]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:740) ~[spring-boot-2.6.7.jar:2.6.7]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:415) ~[spring-boot-2.6.7.jar:2.6.7]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) ~[spring-boot-2.6.7.jar:2.6.7]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1312) ~[spring-boot-2.6.7.jar:2.6.7]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1301) ~[spring-boot-2.6.7.jar:2.6.7]
	at eu.tasgroup.keycloakconfigtask.SleuthGwApplication.main(SleuthGwApplication.java:10) ~[classes/:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'routingFilter' defined in class path resource [org/springframework/cloud/gateway/config/GatewayAutoConfiguration$NettyConfiguration.class]: Unsatisfied dependency expressed through method 'routingFilter' parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gatewayHttpClientFactory' defined in class path resource [org/springframework/cloud/gateway/config/GatewayAutoConfiguration$NettyConfiguration.class]: Unsatisfied dependency expressed through method 'gatewayHttpClientFactory' parameter 2; nested exception is org.springframework.beans.factory.BeanCurrentlyInCreationException: Error creating bean with name 'customizer': Requested bean is currently in creation: Is there an unresolvable circular reference?
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:541) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.addCandidateEntry(DefaultListableBeanFactory.java:1607) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1571) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveMultipleBeans(DefaultListableBeanFactory.java:1460) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1347) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1309) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) [spring-beans-5.3.19.jar:5.3.19]
	... 82 common frames omitted
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'gatewayHttpClientFactory' defined in class path resource [org/springframework/cloud/gateway/config/GatewayAutoConfiguration$NettyConfiguration.class]: Unsatisfied dependency expressed through method 'gatewayHttpClientFactory' parameter 2; nested exception is org.springframework.beans.factory.BeanCurrentlyInCreationException: Error creating bean with name 'customizer': Requested bean is currently in creation: Is there an unresolvable circular reference?
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:541) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1389) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1309) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) [spring-beans-5.3.19.jar:5.3.19]
	... 99 common frames omitted
Caused by: org.springframework.beans.factory.BeanCurrentlyInCreationException: Error creating bean with name 'customizer': Requested bean is currently in creation: Is there an unresolvable circular reference?
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.beforeSingletonCreation(DefaultSingletonBeanRegistry.java:355) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:227) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.addCandidateEntry(DefaultListableBeanFactory.java:1607) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1571) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveMultipleBeans(DefaultListableBeanFactory.java:1460) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1347) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1309) ~[spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) [spring-beans-5.3.19.jar:5.3.19]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) [spring-beans-5.3.19.jar:5.3.19]
	... 113 common frames omitted

[2m2022-05-18 18:16:10.007[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [After]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [Before]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [Between]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [Cookie]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [Header]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [Host]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [Method]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [Path]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [Query]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [ReadBody]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [RemoteAddr]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [XForwardedRemoteAddr]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [Weight]
[2m2022-05-18 18:16:10.008[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.c.g.r.RouteDefinitionRouteLocator   [0;39m [2m:[0;39m Loaded RoutePredicateFactory [CloudFoundryRouteService]
[2m2022-05-18 18:16:10.212[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.b.a.e.web.EndpointLinksResolver     [0;39m [2m:[0;39m Exposing 1 endpoint(s) beneath base path '/actuator'
[2m2022-05-18 18:16:11.348[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.b.web.embedded.netty.NettyWebServer [0;39m [2m:[0;39m Netty started on port 8080
[2m2022-05-18 18:16:12.693[0;39m [32m INFO [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[           main][0;39m [36me.t.k.SleuthGwApplication               [0;39m [2m:[0;39m Started SleuthGwApplication in 7.323 seconds (JVM running for 8.227)
[2m2022-05-18 18:16:16.249[0;39m [32mDEBUG [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[ctor-http-nio-3][0;39m [36mr.n.http.server.HttpServerOperations    [0;39m [2m:[0;39m [7f4b81aa, L:/0:0:0:0:0:0:0:1:8080 - R:/0:0:0:0:0:0:0:1:59766] New http connection, requesting read
[2m2022-05-18 18:16:16.249[0;39m [32mDEBUG [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[ctor-http-nio-2][0;39m [36mr.n.http.server.HttpServerOperations    [0;39m [2m:[0;39m [08685324, L:/0:0:0:0:0:0:0:1:8080 - R:/0:0:0:0:0:0:0:1:59765] New http connection, requesting read
[2m2022-05-18 18:16:16.300[0;39m [32mDEBUG [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[ctor-http-nio-2][0;39m [36mr.n.http.server.HttpServerOperations    [0;39m [2m:[0;39m [08685324, L:/0:0:0:0:0:0:0:1:8080 - R:/0:0:0:0:0:0:0:1:59765] Increasing pending responses, now 1
[2m2022-05-18 18:16:16.306[0;39m [32mDEBUG [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[ctor-http-nio-2][0;39m [36mreactor.netty.http.server.HttpServer    [0;39m [2m:[0;39m [08685324-1, L:/0:0:0:0:0:0:0:1:8080 - R:/0:0:0:0:0:0:0:1:59765] Handler is being applied: org.springframework.http.server.reactive.ReactorHttpHandlerAdapter@130d2eee
[2m2022-05-18 18:16:16.910[0;39m [32mDEBUG [,efbd8bcbe33f76e3,efbd8bcbe33f76e3][0;39m [35m19820[0;39m [2m---[0;39m [2m[ctor-http-nio-2][0;39m [36mr.netty.http.client.HttpClientConnect   [0;39m [2m:[0;39m [1a19d87a-1, L:/127.0.0.1:59767 - R:localhost/127.0.0.1:8085] Handler is being applied: {uri=http://localhost:8085/get, method=GET}
[2m2022-05-18 18:16:16.936[0;39m [32mDEBUG [,efbd8bcbe33f76e3,761f2b4fd9a180ba][0;39m [35m19820[0;39m [2m---[0;39m [2m[ctor-http-nio-2][0;39m [36mr.n.http.client.HttpClientOperations    [0;39m [2m:[0;39m [1a19d87a-1, L:/127.0.0.1:59767 - R:localhost/127.0.0.1:8085] Received response (auto-read:false) : [Server=gunicorn/19.9.0, Date=Wed, 18 May 2022 16:16:16 GMT, Connection=keep-alive, Content-Type=application/json, Access-Control-Allow-Origin=*, Access-Control-Allow-Credentials=true, content-length=1382]
[2m2022-05-18 18:16:16.944[0;39m [32mDEBUG [,efbd8bcbe33f76e3,efbd8bcbe33f76e3][0;39m [35m19820[0;39m [2m---[0;39m [2m[ctor-http-nio-2][0;39m [36mr.n.http.client.HttpClientOperations    [0;39m [2m:[0;39m [1a19d87a-1, L:/127.0.0.1:59767 - R:localhost/127.0.0.1:8085] Received last HTTP packet
[2m2022-05-18 18:16:16.966[0;39m [32mDEBUG [,efbd8bcbe33f76e3,efbd8bcbe33f76e3][0;39m [35m19820[0;39m [2m---[0;39m [2m[ctor-http-nio-2][0;39m [36mr.n.http.server.HttpServerOperations    [0;39m [2m:[0;39m [08685324-1, L:/0:0:0:0:0:0:0:1:8080 - R:/0:0:0:0:0:0:0:1:59765] Last HTTP response frame
[2m2022-05-18 18:16:16.967[0;39m [32mDEBUG [,efbd8bcbe33f76e3,efbd8bcbe33f76e3][0;39m [35m19820[0;39m [2m---[0;39m [2m[ctor-http-nio-2][0;39m [36mr.n.http.server.HttpServerOperations    [0;39m [2m:[0;39m [08685324-1, L:/0:0:0:0:0:0:0:1:8080 - R:/0:0:0:0:0:0:0:1:59765] Decreasing pending responses, now 0
[2m2022-05-18 18:16:16.967[0;39m [32mDEBUG [,,][0;39m [35m19820[0;39m [2m---[0;39m [2m[ctor-http-nio-2][0;39m [36mr.n.http.server.HttpServerOperations    [0;39m [2m:[0;39m [08685324-1, L:/0:0:0:0:0:0:0:1:8080 - R:/0:0:0:0:0:0:0:1:59765] Last HTTP packet was sent, terminating the channel

```
