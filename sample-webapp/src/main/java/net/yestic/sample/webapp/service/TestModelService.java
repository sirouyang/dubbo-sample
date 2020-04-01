package net.yestic.sample.webapp.service;

import com.alibaba.dubbo.config.annotation.Reference;
import java.util.List;
import net.yestic.sample.api.model.TestModel;
import org.springframework.stereotype.Service;

/**
 * @author: yang.kui
 * @email: yang.kui@cesgroup.com.cn
 * @create: 2020-03-31 17:13
 * @description:
 **/
@Service
public class TestModelService {

    @Reference(version = "${demo.service.version}" , url = "${demo.service.url}")
    private net.yestic.sample.api.service.TestModelService testModelService;

    public List<TestModel> findByIdGreaterThanWithPage(Integer minId, int page, int pageSize) {
        return testModelService.findByIdGreaterThanWithPage(minId,page,pageSize);
    }

}
