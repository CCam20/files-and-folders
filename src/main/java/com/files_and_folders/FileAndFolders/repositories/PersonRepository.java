package com.files_and_folders.FileAndFolders.repositories;

import com.files_and_folders.FileAndFolders.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
