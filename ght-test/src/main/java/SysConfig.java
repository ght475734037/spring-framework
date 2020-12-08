import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @title: SysConfig
 * @projectName spring
 * @description: TODO
 * @date 2020/12/8/000814:24
 */

@Configuration
public class SysConfig {
	@Bean
	public SysUser sysUser() {
		return new SysUser("ght", "123");
	}
}
