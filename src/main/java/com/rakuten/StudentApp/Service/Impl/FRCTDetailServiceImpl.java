package com.rakuten.StudentApp.Service.Impl;

import com.rakuten.StudentApp.DAO.IFRCTDetailRepository;
import com.rakuten.StudentApp.Model.FRCTDetail;
import com.rakuten.StudentApp.Service.IFRCTDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FRCTDetailServiceImpl  implements IFRCTDetailService {


    @Autowired
    IFRCTDetailRepository frctDetailRepository;

    @Override
    public FRCTDetail create(FRCTDetail frctDetail) {
        return frctDetailRepository.save(frctDetail);
    }
}
