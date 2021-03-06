package org.zerock;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Board;
import org.zerock.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot03ApplicationTests {
	@Autowired
	private BoardRepository repo;

/*	@Test
	public void testInsert200() {
		for(int i=0;i<=200;i++) {
			Board board=new Board();
			board.setTitle("제목.."+i);
			board.setContent("내용 ...."+i+"채우기");
			board.setWriter("user0"+(i%10));
			repo.save(board);
		}
	}*/
/*	@Test
	public void testByTitle(	) {
		repo.findBoardByTitle("제목...177").forEach(board->System.out.println(board));
	}*/
/*	@Test
	public void testByWriter() {
		Collection<Board> results=repo.findByWriter("user00");
		results.forEach(board -> System.out.println(board));
	}*/
/*	@Test
	public void testByWriterContaining() {
		Collection<Board> results=repo.findByWriterContaining("05");
		results.forEach(board -> System.out.println(board));
	}*/
/*	@Test
	public void testByWriterContaining() {
		Collection<Board> results=repo.findByWriterContaining("05");
		results.forEach(board -> System.out.println(board));
	}
*/
	@Test
	public void testByWriterContaining() {
		Pageable paging=new PageRequest(0,10);
		Collection<Board> results=repo.findByBnoGreaterThanOrderByBnoDesc(0L, paging);
		results.forEach(board -> System.out.println(board));
	}
	

}
