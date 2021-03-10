package ru.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.entity.CmsPage;

public interface CmsRepository extends JpaRepository<CmsPage, Long> {
}
