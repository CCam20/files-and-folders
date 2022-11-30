package com.files_and_folders.FileAndFolders.components;

import com.files_and_folders.FileAndFolders.models.File;
import com.files_and_folders.FileAndFolders.models.Folder;
import com.files_and_folders.FileAndFolders.models.Person;
import com.files_and_folders.FileAndFolders.repositories.FileRepository;
import com.files_and_folders.FileAndFolders.repositories.FolderRepository;
import com.files_and_folders.FileAndFolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    PersonRepository personRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person colin = new Person("Colin");
        personRepository.save(colin);

        Folder docs = new Folder("My Documents", colin);
        folderRepository.save(docs);

        Folder pics = new Folder("My Pictures", colin);
        folderRepository.save(pics);

        File doc1 = new File("My Book", ".txt", 80, docs);
        fileRepository.save(doc1);
        File doc2 = new File("My CV", ".pdf", 60, docs);
        fileRepository.save(doc2);
        File doc3 = new File("My Games", ".txt", 180, docs);
        fileRepository.save(doc3);

        File pic1 = new File("Cat", ".png", 100, pics);
        fileRepository.save(pic1);
        File pic2 = new File("Dog", ".jpeg", 120, pics);
        fileRepository.save(pic2);
        File pic3 = new File("Bird", ".png", 150, pics);
        fileRepository.save(pic3);







    }
}
