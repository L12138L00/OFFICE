package com.atguigu.auth.contriller;


import com.atguigu.auth.service.SysRoleService;
import com.atguigu.model.system.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/User")
public class SysRoleController {

    @Autowired
     private  SysRoleService sysRoleService;
    @GetMapping("/admin")
    public SysRole SysRoleAdmin(){
        SysRole SysRole =new SysRole();
        return SysRole;

    }


}
