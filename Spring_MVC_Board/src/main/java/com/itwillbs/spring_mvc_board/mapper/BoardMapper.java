package com.itwillbs.spring_mvc_board.mapper;

import com.itwillbs.spring_mvc_board.vo.BoardVO;

public interface BoardMapper {

	// 글 쓰기
	int insertBoard(BoardVO board);

}
