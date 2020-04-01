package net.yestic.sample.webapp.web;

import java.util.List;
import net.yestic.sample.api.model.TestModel;
import net.yestic.sample.webapp.service.IndexService;
import net.yestic.sample.webapp.service.TestModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yang.kui
 * @email: yang.kui@cesgroup.com.cn
 * @create: 2020-03-31 15:17
 * @description:
 **/
@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @Autowired
    private TestModelService testModelService;

    @RequestMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return indexService.sayHello(name);
    }

    @RequestMapping(value = "/getTestModelList")
    public List<TestModel> getTestModelList(@RequestParam Integer minId,@RequestParam int page,@RequestParam int pageSize) {
        return testModelService.findByIdGreaterThanWithPage(minId,page,pageSize);
    }

}
