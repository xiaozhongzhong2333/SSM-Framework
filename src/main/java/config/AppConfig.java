package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Springz总的应用配置
 * 应用配置
 * @author RanJi
 *
 */
@Configuration
@ComponentScan({"dao","service","controller"})
@Import({JdbcConfig.class,WebConfig.class})
public class AppConfig {
	
}