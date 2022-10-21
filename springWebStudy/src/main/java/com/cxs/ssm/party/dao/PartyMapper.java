package com.cxs.ssm.party.dao;

import com.cxs.ssm.party.model.Party;

import java.util.List;

public interface PartyMapper {

    // 添加
    public void addParty(Party party);

    //删除
    public void deleteParty(int partyId);

    //修改
    public void updateParty(Party party);

    // 通过id查询
    public Party findPartyById(int partyId);

    //查询所有
    public List<Party> findAllParty();

}
