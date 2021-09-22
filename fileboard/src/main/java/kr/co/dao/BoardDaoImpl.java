package kr.co.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.vo.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao{
	@Autowired
	private SqlSession sqlSession;
	
	//게시글 작성
	@Override
	public void write(BoardVo boardVo) throws Exception {
		sqlSession.insert("sql-mapper.insert", boardVo);
	}
	
	// 게시물 목록 조회
	@Override
	public List<BoardVo> list() throws Exception {
		return sqlSession.selectList("sql-mapper.list");
	}
	
	// 게시물 조회
	@Override
	public BoardVo read(int boardNum) throws Exception {
		return sqlSession.selectOne("sql-mapper.read", boardNum);
	}
	
	// 게시물 수정
	@Override
	public void update(BoardVo boardVo) throws Exception {

		sqlSession.update("sql-mapper.update", boardVo);
	}

	// 게시물 삭제
	@Override
	public void delete(int boardNum) throws Exception {

		sqlSession.delete("sql-mapper.delete", boardNum);
	}
}
