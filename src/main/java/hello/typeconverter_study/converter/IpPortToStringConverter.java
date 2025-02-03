package hello.typeconverter_study.converter;

import hello.typeconverter_study.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

//IpPort 객체를 입력하면 127.0.0.1:8080 같은 문자로 반환한다.
@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {
    @Override
    public String convert(IpPort source) {
        log.info("convert source={}", source);
        return source.getIp() + ":" + source.getPort();
    }
}
