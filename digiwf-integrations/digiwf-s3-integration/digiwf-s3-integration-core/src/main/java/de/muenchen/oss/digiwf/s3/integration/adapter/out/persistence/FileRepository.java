package de.muenchen.oss.digiwf.s3.integration.adapter.out.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

public interface FileRepository extends PagingAndSortingRepository<File, UUID>, CrudRepository<File, UUID> {

  void deleteByPathToFile(final String pathToFile);

  Stream<File> findByPathToFileStartingWith(final String pathToFolder);

  Optional<File> findByPathToFile(final String pathToFile);

  Stream<File> findAllByEndOfLifeNotNullAndEndOfLifeBefore(final LocalDate date);

  Stream<File> findAllByEndOfLifeIsNull();

}
