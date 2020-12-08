import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 * @title: ZszxzMain
 * @projectName spring
 * @description: TODO
 * @date 2020/12/8/000814:25
 */


public class ZszxzMain {
	public static void main(String[] args) {
		// 获取容器
		ApplicationContext ac = new AnnotationConfigApplicationContext(SysConfig.class);
		// 获取 bean
		SysUser user = (SysUser) ac.getBean("sysUser");
		System.out.println(user.toString());
	}
}
