package net.yestic.sample.provider.provider;

import java.util.Date;
import net.yestic.sample.api.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

	@Override
    public String sayHello(String name) {
        return "Hello, " + name + ", " + new Date();
    }

}