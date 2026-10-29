package id.ac.ub.filkom.contoh.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BukuRepository extends JpaRepository<Buku, String> {
    List<Buku> findByJudulContainingIgnoreCase(String kata);
}