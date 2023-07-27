package com.rakuten.StudentApp.Helper;

import com.rakuten.StudentApp.DAO.SearchCriteria;
import com.rakuten.StudentApp.Model.Student;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Criteria;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StudentSpecification implements Specification<Student> {

    private List<SearchCriteria> criteriaList ;

    public StudentSpecification() {
        this.criteriaList= new ArrayList<>();
    }

    public void add(SearchCriteria searchCriteria)
    {
        criteriaList.add(searchCriteria);
    }


    @Override
    public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

        List<Predicate> predicates = new ArrayList<>();

        for (SearchCriteria searchCriteria:criteriaList)
        {
            if(searchCriteria.getOperation().equals(SearchOperation.GREATER_THAN)) {

                log.info("Key and value :  {} {}",searchCriteria.getKey(),searchCriteria.getValue());
                predicates.add(criteriaBuilder.greaterThan(
                        root.get(searchCriteria.getKey()), searchCriteria.getValue().toString()));
            }
            else if(searchCriteria.getOperation().equals(SearchOperation.LESS_THAN))
            {
                predicates.add(criteriaBuilder.lessThan(root.get(searchCriteria.getKey()),searchCriteria.getValue().toString()));
            }
            else if(searchCriteria.getOperation().equals(SearchOperation.EQUAL))
            {
                log.info("Key and value :  {} {}",searchCriteria.getKey(),searchCriteria.getValue());
                predicates.add(criteriaBuilder.equal(root.get(searchCriteria.getKey()),searchCriteria.getValue().toString()));
            }
            else if (searchCriteria.getOperation().equals(SearchOperation.LESS_THAN_EQUAL)) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(
                        root.get(searchCriteria.getKey()), searchCriteria.getValue().toString()));
            } else if (searchCriteria.getOperation().equals(SearchOperation.NOT_EQUAL)) {
                predicates.add(criteriaBuilder.notEqual(
                        root.get(searchCriteria.getKey()), searchCriteria.getValue()));
            } else if(searchCriteria.getOperation().equals(SearchOperation.MATCH))
            {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower
                        (root.get(searchCriteria.getKey())),"%"+searchCriteria.getValue().toString().toLowerCase()+"%"));
            }else if(searchCriteria.getOperation().equals(SearchOperation.IN))
            {
                predicates.add(criteriaBuilder.in(root.get(searchCriteria.getKey())).value(searchCriteria.getValue()));
            }
            else if(searchCriteria.getOperation().equals(SearchOperation.NOT_EQUAL))
            {
                predicates.add(criteriaBuilder.not(root.get(searchCriteria.getKey())).in(searchCriteria.getValue()));
            }
        }
        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }
}
