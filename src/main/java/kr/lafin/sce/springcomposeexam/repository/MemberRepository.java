package kr.lafin.sce.springcomposeexam.repository;

import kr.lafin.sce.springcomposeexam.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
