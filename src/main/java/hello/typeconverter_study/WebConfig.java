package hello.typeconverter_study;

import hello.typeconverter_study.converter.IntegerToStringConverter;
import hello.typeconverter_study.converter.IpPortToStringConverter;
import hello.typeconverter_study.converter.StringToIntegerConverter;
import hello.typeconverter_study.converter.StringToIpPortConverter;
import hello.typeconverter_study.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //주석처리 우선순위: 컨버터와 포매터의 기능이 겹칠 때 컨버터가 우선으로 적용되므로 주석처리 한다.
        //registry.addConverter(new StringToIntegerConverter());
        //registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new IpPortToStringConverter());
        registry.addConverter(new StringToIpPortConverter());

        //추가
        registry.addFormatter(new MyNumberFormatter());
    }
}
