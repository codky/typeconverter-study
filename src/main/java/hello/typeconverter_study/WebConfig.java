package hello.typeconverter_study;

import hello.typeconverter_study.converter.IntegerToStringConverter;
import hello.typeconverter_study.converter.IpPortToStringConverter;
import hello.typeconverter_study.converter.StringToIntegerConverter;
import hello.typeconverter_study.converter.StringToIpPortConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToIntegerConverter());
        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new IpPortToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
    }
}
