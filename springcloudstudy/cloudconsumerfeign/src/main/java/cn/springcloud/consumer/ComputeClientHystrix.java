package cn.springcloud.consumer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ComputeClientHystrix implements ComputeClient {


    public Integer add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return -9999;
    }
}
