package com.imooc.o2o.dao;

import org.junit.Test;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Process
 *
 * @version 1.0
 */
public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();
        System.out.println(areaList.toArray()[0]);
        assertEquals(2, areaList.size());
    }
}
