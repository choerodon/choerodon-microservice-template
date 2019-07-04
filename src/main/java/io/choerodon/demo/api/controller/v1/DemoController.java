package io.choerodon.demo.api.controller.v1;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.choerodon.base.annotation.Permission;
import io.choerodon.base.enums.ResourceType;

@RestController
@RequestMapping("v1/demo")
public class DemoController {

    @GetMapping("/hello")
    @Permission(type = ResourceType.SITE)
    @ApiOperation(value = "demo")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }
}