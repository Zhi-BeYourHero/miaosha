package com.zhi.controller;

import com.zhi.domain.MiaoshaUser;
import com.zhi.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WenZhi Luo
 * @version 1.0
 * @date 2020/2/6 10:06
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/info")
    @ResponseBody
    public Result<MiaoshaUser> info(Model model, MiaoshaUser user) {
        return Result.success(user);
    }
}
