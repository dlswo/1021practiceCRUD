package org.aram.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.aram.domain.Board;
import org.aram.domain.Param;


public interface BoardMapper {
	
	public List<Board> getList(Param param);
	
	public int register(Board board);
	
	public Board read(Param param);
	
	public int remove(Param param);
	
	public int update(Board board);

	public int count();
}
