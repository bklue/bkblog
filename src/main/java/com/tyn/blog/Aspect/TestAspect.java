package com.tyn.blog.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wangl
 * @Description todo
 * @date 12/6/2019 4:02 PM
 */
//AOP为Aspect Oriented Programming的缩写，意为：面向切面编程，通过预编译方式和运行期动态代理实现程序功能的统一维护的一种技术.
// AOP是OOP的延续，是软件开发中的一个热点，也是Spring框架中的一个重要内容，是函数式编程的一种衍生范型。利
// 用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各部分之间的耦合度降低，提高程序的可重用性，同时提高了开发的效率。
//在spring AOP中业务逻辑仅仅只关注业务本身，将日志记录，性能统计，安全控制，事务处理，异常处理等代码从业务逻辑代码中划分出来，
// 通过对这些行为的分离，我们希望可以将它们独立到非指导业务逻辑的方法中，进而改变这些行为的时候不影响业务逻辑的代码


//@Aspect:作用是把当前类标识为一个切面供容器读取

//@Pointcut：Pointcut是植入Advice的触发条件。每个Pointcut的定义包括2部分，一是表达式，二是方法签名。方
// 法签名必须是 public及void型。可以将Pointcut中的方法看作是一个被Advice引用的助记符，因为表达式不直观，
// 因此我们可以通过方法签名的方式为 此表达式命名。因此Pointcut中的方法只需要方法签名，而不需要在方法体内编写实际代码。
//@Around：环绕增强，相当于MethodInterceptor
//@AfterReturning：后置增强，相当于AfterReturningAdvice，方法正常退出时执行
//@Before：标识一个前置增强方法，相当于BeforeAdvice的功能，相似功能的还有
//@AfterThrowing：异常抛出增强，相当于ThrowsAdvice
//@After: final增强，不管是抛出异常或者正常退出都会执行

@Aspect
@Component  //表示由spring来管理
@Slf4j   //日志管理
public class TestAspect {
    //凡是注解了RequestMapping的方法都被拦截
    // @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    @Pointcut("execution(public * com.tyn.blog.*.*(..))")
    private void webPointcut() {
    }

    @AfterThrowing(pointcut = "webPointcut()", throwing = "e")
    public void handleThrowing(Exception e) {
        e.printStackTrace();
        log.error("发现异常！" + e.getMessage());
        //log.error(JSON.toJSONString(e.getStackTrace()));

    }
}
