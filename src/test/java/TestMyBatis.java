

import com.alibaba.fastjson.JSON;
import com.moodincode.beans.User;
import com.moodincode.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * createBy: moodincode
 * createDate: 2018/7/25 10:04
 * lastModifyDate: 2018/7/25 10:04
 * description:测试spring和mybatis整合是否通过
 */
/**需要spring-test.jar和JUnit 4.8以上版本**/
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})//加载配置文件
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    //  private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;

//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }

    @Test
    public void test1() {
        User user = userService.getUser(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}
