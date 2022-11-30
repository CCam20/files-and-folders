package com.files_and_folders.FileAndFolders.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
//    @ManyToMany
//    @JsonBackReference
//    @JoinTable(
//            name = "person_folders",
//            joinColumns = { @JoinColumn (
//                    name = "folder_id",
//                    nullable = false,
//                    updatable = false
//            )
//            },
//            inverseJoinColumns = {@JoinColumn (
//                    name = "person_id",
//                    nullable = false,
//                    updatable = false
//            )
//            }
//    )
    @JsonBackReference
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY )
    private List<Folder> folders;

    public Person(String name) {
        this.name = name;
        this.folders = new ArrayList<Folder>();
    }
    public Person(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
}
