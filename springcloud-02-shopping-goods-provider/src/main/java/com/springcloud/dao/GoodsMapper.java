package com.springcloud.dao;

import com.springcloud.entity.Goods;
import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);
    
    /**
     * ��ѯGoods����������������Ʒ��Ϣ
     * 
     * @param goods ��ѯ����
     * @return	�ɹ�����java.util.List���͵�ʵ�������򷵻�null
     */
    public abstract List<Goods> select(Goods goods);
    
     
    /**
     * ���������޸�GOODS����ָ����GOODS_ID����Ʒ��Ϣ
     * @param goods
     * @return
     * 	�ɹ����ش���0�����������򷵻�С��0������
     */	
    public abstract Integer updateGoodsById(Goods goods);
    
    /**
     * ��ѯ����ǰ10����Ʒ��Ϣ
     * @return	�ɹ�����java.util.List���͵�ʵ�������򷵻�null
     */
    public abstract List<Goods> selectGroup();
}