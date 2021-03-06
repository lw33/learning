package lw.learning.springboot.sbwebmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author lw
 * @Date 2019-02-17 10:36:43
 **/
//@EnableWebMvc
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

   /* @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("classpath:/templates/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }*/

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                System.out.println("WebMvcConfig.preHandle");
                return true;
            }
        });
    }
}
