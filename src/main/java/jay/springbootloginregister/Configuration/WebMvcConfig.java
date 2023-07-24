package jay.springbootloginregister.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("views/access-denied").setViewName("views/access-denied");
        registry.addViewController("/").setViewName("views/homepage");
        registry.addViewController("views/about-us").setViewName("views/about-us");
    }
}
