package org.zerock.persistence;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.zerock.domain.Board;

public interface BoardRepository extends CrudRepository<Board,Long>{
	public List<Board> findBoardByTitle(String title);
	public Collection<Board> findByWriter(String writer);
	public Collection<Board> findByWriterContaining(String writer);
	public Collection<Board> findByTitleContainingOrContentContaining(String title,String content);
	public List<Board> findByBnoGreaterThanOrderByBnoDesc(Long bno,Pageable paging);
}
