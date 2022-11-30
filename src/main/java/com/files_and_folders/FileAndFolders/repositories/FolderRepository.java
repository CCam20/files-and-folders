package com.files_and_folders.FileAndFolders.repositories;

import com.files_and_folders.FileAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder,Long> {
}
