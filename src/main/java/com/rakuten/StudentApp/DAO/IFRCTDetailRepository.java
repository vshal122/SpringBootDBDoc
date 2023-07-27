package com.rakuten.StudentApp.DAO;

import com.rakuten.StudentApp.Model.FRCTDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFRCTDetailRepository extends JpaRepository<FRCTDetail,Integer> {
}
