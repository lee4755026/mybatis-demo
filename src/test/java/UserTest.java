import com.alibaba.fastjson.JSON;
import com.lairen.pojo.User;
import com.lairen.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.logging.Logger;

/**
 * Created by lee on 16/2/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserTest {
    private static Logger logger =Logger.getLogger("UserTest");
    @Resource
    private IUserService userService;

    @Test
    public void testGetUserById(){
        User user = userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
    }
}
