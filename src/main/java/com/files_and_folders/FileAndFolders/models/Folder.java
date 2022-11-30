package com.files_and_folders.FileAndFolders.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @JsonBackReference
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY )
    private List<File> files;
//    @ManyToMany
//    @JsonBackReference
//    @JoinTable(
//            name = "person_folders",
//            joinColumns = { @JoinColumn (
//                    name = "person_id",
//                    nullable = false,
//                    updatable = false
//            )
//            },
//            inverseJoinColumns = {@JoinColumn (
//                    name = "folder_id",
//                    nullable = false,
//                    updatable = false
//            )
//            }
//    )
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Folder(String title, Person person) {
        this.title = title;
//        this.person = new ArrayList<Person>();
        this.person = person;
        this.files = new ArrayList<File>();
    }
    public Folder(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
