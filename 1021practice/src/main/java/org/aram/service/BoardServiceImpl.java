package org.aram.service;

import java.util.List;

import org.aram.domain.Board;
import org.aram.domain.Param;
import org.aram.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	private BoardMapper mapper;
	
	@Override
	public List<Board> getList(Param param) {

		return mapper.getList(param);
	}

	@Override
	public int register(Board board) {
		
		return mapper.register(board);
	}

	@Override
	public Board read(Param param) {
		
		return mapper.read(param);
	}

	@Override
	public int remove(Param param) {

		return mapper.remove(param);
	}

	@Override
	public int update(Board board) {

		return mapper.update(board);
	}

	@Override
	public int count() {
		
		return mapper.count();
	}

}
