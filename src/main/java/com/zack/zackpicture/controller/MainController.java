package com.zack.zackpicture.controller;

import com.zack.zackpicture.common.BaseResponse;
import com.zack.zackpicture.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    /**
     * 健康检查
     * @return
     */
    public BaseResponse<String> health(){
        return ResultUtils.success("ok");
    }
}
