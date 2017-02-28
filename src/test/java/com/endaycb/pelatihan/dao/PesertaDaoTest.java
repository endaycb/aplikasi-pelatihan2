/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endaycb.pelatihan.dao;

import com.endaycb.pelatihan.model.Peserta;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.util.logging.LoggingSupport;

/**
 *
 * @author MASHIRO
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PesertaDaoTest {
    
    
    @Autowired
    private PesertaDao pd;
    
    @Test
    public void testInsert(){
        //p = new Peserta("Peserta 001", "peserta001@gmail.com", new Date());
        Peserta p = new Peserta();
        p.setId("012891f1-ec8f-4b11-a670-51b4996c912f");
        p.setNama("peserta 002");
        p.setEmail("peserta001@gmail.com");
        p.setTanggalLahir(new Date());
        
        pd.save(p);
        
    }
}
