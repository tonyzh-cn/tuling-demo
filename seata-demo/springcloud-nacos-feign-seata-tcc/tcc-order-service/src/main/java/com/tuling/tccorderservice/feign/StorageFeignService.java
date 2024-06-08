package com.tuling.tccorderservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Fox
 */
@FeignClient(name="tcc-storage-service",path="/storage")
@Repository
public interface StorageFeignService {
    
    @RequestMapping(path = "/deduct")
    Boolean deduct(@RequestParam("commodityCode") String commodityCode,
                   @RequestParam("count") Integer count);
    
}
