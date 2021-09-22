package kr.co.dao;

import java.util.List;

import kr.co.vo.BoardVo;

public interface BoardDao {
	// 게시글 작성
	public void write(BoardVo boardVo) throws Exception;

	// 게시물 목록 조회
	public List<BoardVo> list() throws Exception;

	// 게시물 조회
	public BoardVo read(int boardNum) throws Exception;

	// 게시물 수정
	public void update(BoardVo boardVO) throws Exception;

	// 게시물 삭제
	public void delete(int boardNum) throws Exception;
}
