package kr.or.ddit.service;

import kr.or.ddit.model.MemberVo;

public interface MemberServiceInf {

	MemberVo selectUser(String mem_id);
}
