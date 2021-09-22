package kr.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dao.BoardDao;
import kr.co.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao dao;
	
	//�Խñ� �ۼ�
	@Override
	public void write(BoardVo boardVo) throws Exception{
		dao.write(boardVo);
	}
	
	// �Խù� ��� ��ȸ
	@Override
	public List<BoardVo> list() throws Exception {
		return dao.list();
	}
	
	// �Խù� ��� ��ȸ
	@Override
	public BoardVo read(int boardNum) throws Exception {
		return dao.read(boardNum);
	}
	
	@Override
	public void update(BoardVo boardVo) throws Exception {
		dao.update(boardVo);
	}

	@Override
	public void delete(int boardNum) throws Exception {
		dao.delete(boardNum);
	}
}
