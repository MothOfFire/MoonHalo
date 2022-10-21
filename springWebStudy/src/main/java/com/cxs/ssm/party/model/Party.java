package com.cxs.ssm.party.model;

import com.cxs.ssm.party.dao.PartyMapper;
import com.cxs.ssm.party.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class Party {
    private int partyId;
    private String partyName;
    private String partyType;
    private String partyLevel;
    private String phone;
    private String address;

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public String getPartyLevel() {
        return partyLevel;
    }

    public void setPartyLevel(String partyLevel) {
        this.partyLevel = partyLevel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Party{" +
                "partyId=" + partyId +
                ", partyName='" + partyName + '\'' +
                ", partyType='" + partyType + '\'' +
                ", partyLevel='" + partyLevel + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Service
    public static class PartyServiceImpl implements PartyService {

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
}
