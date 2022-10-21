package com.cxs.ssm.party.service.impl;

import com.cxs.ssm.party.dao.PartyMapper;
import com.cxs.ssm.party.model.Party;
import com.cxs.ssm.party.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyServiceImpl implements PartyService {

    @Autowired
    private PartyMapper mapper;

    @Override
    public void addParty(Party party) {
        mapper.addParty(party);
    }

    @Override
    public void deleteParty(int partyId) {
        mapper.deleteParty(partyId);
    }

    @Override
    public void updateParty(Party party) {
        mapper.updateParty(party);
    }

    @Override
    public Party findPartyById(int partyId) {
        return mapper.findPartyById(partyId);
    }

    @Override
    public List<Party> findAllParty() {
        return mapper.findAllParty();
    }
}
