package coffeshop_backend.coffeshop_project_backend.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import coffeshop_backend.coffeshop_project_backend.utils.CarMessageSource;
import coffeshop_backend.coffeshop_project_backend.utils.ResourceBundleNames;

@Configuration
public class LocalizationConfig {


    FixedLocaleResolver fixedLocaleResolver() {
		FixedLocaleResolver sessionLocaleResolver = new FixedLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(Locale.ENGLISH);
		return sessionLocaleResolver;
	}
    
    @Bean
    LocaleChangeInterceptor localeChangeInterceptor() {
    	LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
    	interceptor.setParamName("lang");
    	return interceptor;
    }
    
    @Bean
    CarMessageSource carMessageSource() {
    	CarMessageSource carMessageSource = new CarMessageSource();
    	carMessageSource.setBasename(ResourceBundleNames.CORE_BASE_NAME);
    	carMessageSource.setUseCodeAsDefaultMessage(false);
    	return carMessageSource;
    }
}
