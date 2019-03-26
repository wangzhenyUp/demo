package com.example.junitdemo.service;

import com.example.junitdemo.entity.Commodity;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class CommodityServiceImplTest{
    private CommodityServiceImpl commodityService = new CommodityServiceImpl();
    private static List<Commodity> commodityList = new ArrayList();



    @BeforeClass
    public static void  setUp(){
        Commodity commodity1 = new Commodity(1,"商品1","cd001001",6.6);
        Commodity commodity2 = new Commodity(2,"商品2","cd001002",8.8);
        Commodity commodity3 = new Commodity(3,"商品3","cd001003",9.9);
        commodityList.add(commodity1);commodityList.add(commodity2);commodityList.add(commodity3);
    }

    //@Test(expected = IndexOutOfBoundsException.class)期望测试方法可以抛出IndexOutOfBoundsException

    //设置时间限制
    @Test(timeout = 50)
    public void getAllCommodityInfo(){

        List<Commodity> commoditytest = commodityService.getALLCommodityInfo(commodityList);
        Commodity commodity = new Commodity(1,"商品1","cd001001",6.6);
        //断言为true,assertFalse()相反
        Commodity commodity1 = commoditytest.get(0);
        Assert.assertEquals(1, commodity1.getId());

        //断言相等,assertNotEquals()相反
        Assert.assertEquals(commodity, commodity1);

        //断言不为空,assertNull()相反
        Assert.assertNotNull(commoditytest);

        //断言对象不同,assertSame()相反.这里相当与==
        Assert.assertNotSame(commodity, commodity1);

        //使用assertj进行断言,commoditytest是否包含commodity
        assertThat(commoditytest).contains(commodity);
    }

}
