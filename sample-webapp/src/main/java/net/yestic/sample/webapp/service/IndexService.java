package net.yestic.sample.webapp.service;

import com.alibaba.dubbo.config.annotation.Reference;
import net.yestic.sample.api.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author: yang.kui
 * @email: yang.kui@cesgroup.com.cn
 * @create: 2020-03-31 15:18
 * @description:
 **/
@Service
public class IndexService {

    //@Reference(version = "1.0.0" , url = "dubbo://127.0.0.1:20880")
    //@Reference(version = "1.0.0")
    @Reference(version = "${demo.service.version}" , url = "${demo.service.url}")
    private DemoService demoService;

    public String sayHello(String name){
       return demoService.sayHello(name);
    }

}
