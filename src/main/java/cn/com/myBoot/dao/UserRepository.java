package cn.com.myBoot.dao;


import cn.com.myBoot.entity.User;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by t420 on 2017/5/17.
 */
@Repository
public interface UserRepository  extends PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User>  {
    @Query(value="select t from User t where t.userName = :name")
    User findUser(@Param("name") String name);

}