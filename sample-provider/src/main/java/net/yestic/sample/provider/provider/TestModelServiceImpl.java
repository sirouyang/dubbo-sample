package net.yestic.sample.provider.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import net.yestic.sample.api.model.TestModel;
import net.yestic.sample.api.service.TestModelService;
import net.yestic.sample.provider.mapper.TestModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: yang.kui
 * @email: yang.kui@cesgroup.com.cn
 * @create: 2020-03-31 17:10
 * @description:
 **/
@Service(version = "${demo.service.version}")
public class TestModelServiceImpl implements TestModelService {

    @Autowired
    private TestModelMapper testModelMapper;

    @Override
    public Page<TestModel> findByIdGreaterThanWithPage(Integer minId, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return (Page<TestModel>) testModelMapper.findByIdGreaterThan(minId);
    }

}
