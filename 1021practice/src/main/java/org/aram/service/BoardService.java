package org.aram.service;

import java.util.List;

import org.aram.domain.Board;
import org.aram.domain.Param;

public interface BoardService {
	
	public List<Board> getList(Param param);
	
	public int register(Board board);
	
	public Board read(Param param);
	
	public int remove(Param param);
	
	public int update(Board board);
	
	public int count();
}
