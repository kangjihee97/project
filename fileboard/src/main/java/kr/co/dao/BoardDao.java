package kr.co.dao;

import java.util.List;

import kr.co.vo.BoardVo;

public interface BoardDao {
	// �Խñ� �ۼ�
	public void write(BoardVo boardVo) throws Exception;

	// �Խù� ��� ��ȸ
	public List<BoardVo> list() throws Exception;

	// �Խù� ��ȸ
	public BoardVo read(int boardNum) throws Exception;

	// �Խù� ����
	public void update(BoardVo boardVO) throws Exception;

	// �Խù� ����
	public void delete(int boardNum) throws Exception;
}
