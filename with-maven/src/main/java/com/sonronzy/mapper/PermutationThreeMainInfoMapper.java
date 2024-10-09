package com.sonronzy.mapper;

import com.sonronzy.entity.PermutationThreeMainInfo;

public interface PermutationThreeMainInfoMapper {
    int deleteByPrimaryKey(String uid);

    int insert(PermutationThreeMainInfo record);

    int insertSelective(PermutationThreeMainInfo record);

    PermutationThreeMainInfo selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(PermutationThreeMainInfo record);

    int updateByPrimaryKey(PermutationThreeMainInfo record);
}