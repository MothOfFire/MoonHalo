package com.cxs.ssm.party.controller;

import com.cxs.ssm.party.model.Party;
import com.cxs.ssm.party.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PartyController {

    @Autowired
    private PartyService partyService;

    @GetMapping("/partylist")
    public String partyList(Model model){
        //调⽤服务接⼝,获得数据
        List<Party> list = partyService.findAllParty();
        //把数据放进model,传递给⻚⾯展现
        model.addAttribute("partylist",list);
        //跳转到展现⻚⾯
        return "/jsp/party/party_list";
    }

    //响应添加按钮
    @GetMapping("/topartyadd")
    public String toPartyAdd(Model model){
        //跳转到添加⻚⾯
        return "/jsp/party/party_add";
    }

    //响应添加页面的保存按钮
    @PostMapping("/partyadd")
    //另一种写法
    //@RequestMapping(value = "/partyadd",method = RequestMethod.POST)
    public String partyAdd(Party party, Model model){
        //调⽤服务接⼝,添加数据
        partyService.addParty(party);
        //重定向到列表url
        return "redirect:partylist";
    }

    //响应修改按钮
    @GetMapping("/topartyedit")
    public String toPartyEdit(int partyId,Model model){
        //调⽤服务接⼝,通过id查询获得数据
        Party party = partyService.findPartyById(partyId);
        //把数据放进model,传递给⻚⾯展现
        model.addAttribute("party",party);
        //跳转到修改⻚⾯
        return "/jsp/party/party_edit";
    }

    //响应修改页面保存按钮
    @PostMapping("/partyedit")
    public String partyEdit(Party party, Model model){
        //调⽤服务接⼝,更新数据
        partyService.updateParty(party);
        //重定向到列表url
        return "redirect:partylist";
    }

    //响应删除按钮
    @RequestMapping("/partydelete")
    public String partyDelete(int partyId){
        //调⽤服务接⼝,删除
        partyService.deleteParty(partyId);
        //重定向到列表url
        return "redirect:partylist";
    }

}
