package org.aram.mapper;

import org.aram.domain.Board;
import org.aram.domain.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void test() {
		Param param = new Param();
		log.info(mapper.getList(param));
	}
	
	@Test
	public void test2() {
		Board board = new Board();
		
		board.setTitle("테스트했습니다");
		board.setWriter("저도 갔다옵니다");
		board.setContent("황슨생님");
		mapper.register(board);
	}
	
	@Test
	public void test3() {
//		Param param = new Param();
//		param.setBno(3);
//		log.info(mapper.read(param));
	}
	
	@Test
	public void test4() {
		Board board = new Board();
		
		board.setTitle("바뀐겁니까");
		board.setWriter("바꼈냐구요");
		board.setContent("황슨생님");
		board.setBno(1);
		
		mapper.update(board);
	}
	
	@Test
	public void test5() {
		log.info(mapper.count());
	}
}
