package nowwherewasi;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "thoughts", path = "thoughts")
public interface ThoughtRepository  extends PagingAndSortingRepository<Thought, Long>{
	List<Thought> findAllByThought(@Param("thought") String thought);
	List<Thought> findAllByPlace(@Param("place") String place);
}
