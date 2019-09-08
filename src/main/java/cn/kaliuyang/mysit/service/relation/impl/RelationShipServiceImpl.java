package cn.kaliuyang.mysit.service.relation.impl;

import cn.kaliuyang.mysit.dao.RelationShipDao;
import cn.kaliuyang.mysit.service.relation.RelationShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lynnok on 2018/4/30.
 */
@Service
public class RelationShipServiceImpl implements RelationShipService {

    @Autowired
    private RelationShipDao relationShipDao;


}
