package com.files_and_folders.FileAndFolders.repositories;

import com.files_and_folders.FileAndFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Long> {
}
