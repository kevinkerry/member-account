package com.zlebank.zplatform.acc.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zlebank.zplatform.acc.dao.TradeEntryEventMappingDAO;
import com.zlebank.zplatform.acc.pojo.PojoTradeEntryEventMapping;
import com.zlebank.zplatform.member.commons.dao.impl.HibernateBaseDAOImpl;
@Repository
public class TradeEntryEventMappingDAOImpl
        extends
            HibernateBaseDAOImpl<PojoTradeEntryEventMapping>
        implements
            TradeEntryEventMappingDAO {
    @SuppressWarnings("unchecked")
    @Override
    public List<PojoTradeEntryEventMapping> queryAll() {
        Criteria criteria = getSession().createCriteria(
                PojoTradeEntryEventMapping.class);
        return (List<PojoTradeEntryEventMapping>) criteria.list();
    }
    
    @Override
    @Transactional
    public void save(PojoTradeEntryEventMapping tradeEntryEventMapping){
        saveEntity(tradeEntryEventMapping);
    }
}
