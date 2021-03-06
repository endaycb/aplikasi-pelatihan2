package com.endaycb.pelatihan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Sesi {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date mulai;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date sampai;
    
    @ManyToOne
    @JoinColumn(name = "id_materi", nullable = false)
    private Materi materi;
    
    @ManyToMany
    @JoinTable(
        name = "sesi_peserta",
        joinColumns = @JoinColumn(name = "id_sesi"),
        inverseJoinColumns = @JoinColumn(name = "id_peserta")
    )   
    private List<Peserta> daftarPeserta = new ArrayList<>();
}
