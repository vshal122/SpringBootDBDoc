package com.rakuten.StudentApp.Controller.Impl;

import com.rakuten.StudentApp.Controller.IFRCTDetailController;
import com.rakuten.StudentApp.Model.FRCTDetail;
import com.rakuten.StudentApp.Service.IFRCTDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class FRCTDetailController implements IFRCTDetailController {

    @Autowired
    IFRCTDetailService ifrctDetailService;

    //@Cacheable("frctDetail")
    @Override
    public FRCTDetail create(FRCTDetail frctDetail) {
        return ifrctDetailService.create(frctDetail);
    }
}
