package net.yestic.sample.api.service;

import java.util.List;
import net.yestic.sample.api.model.TestModel;

/**
 * @author: yang.kui
 * @email: yang.kui@cesgroup.com.cn
 * @create: 2020-03-31 17:09
 * @description:
 **/
public interface TestModelService {

    List<TestModel> findByIdGreaterThanWithPage(Integer minId, int page, int pageSize);

}
