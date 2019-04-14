package kr.or.ddit.dao;

import kr.or.ddit.model.MemberVo;

public interface MemberDaoInf {

	MemberVo selectUser(String mem_id);
}
