package org.sang.controller;

import org.sang.bean.Hr;
import org.sang.bean.MsgContent;
import org.sang.bean.RespBean;
import org.sang.bean.SysMsg;
import org.sang.service.HrService;
import org.sang.service.SysMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 处理通知消息的Controller
 * 登录即可访问
 */
@Controller
@RequestMapping
public class IndexController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String  home () {
        return "redirect:/index.html";
    }

}
