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
	
	//�Խñ� �ۼ�
	@Override
	public void write(BoardVo boardVo) throws Exception {
		sqlSession.insert("sql-mapper.insert", boardVo);
	}
	
	// �Խù� ��� ��ȸ
	@Override
	public List<BoardVo> list() throws Exception {
		return sqlSession.selectList("sql-mapper.list");
	}
	
	// �Խù� ��ȸ
	@Override
	public BoardVo read(int boardNum) throws Exception {
		return sqlSession.selectOne("sql-mapper.read", boardNum);
	}
	
	// �Խù� ����
	@Override
	public void update(BoardVo boardVo) throws Exception {

		sqlSession.update("sql-mapper.update", boardVo);
	}

	// �Խù� ����
	@Override
	public void delete(int boardNum) throws Exception {

		sqlSession.delete("sql-mapper.delete", boardNum);
	}
}
