package com.idea.mmh.register.biz;

import java.util.List;

import com.idea.mmh.register.dto.MemberDto;

public interface MemberBiz {
	public List<MemberDto> selectList();

	public MemberDto selectOne(int myno);

	public int insert(MemberDto dto);

	public int update(MemberDto dto);

	public int delete(int myno);
	
	/*아이디 중복*/
	public MemberDto idCheck(String m_id);
	
}
