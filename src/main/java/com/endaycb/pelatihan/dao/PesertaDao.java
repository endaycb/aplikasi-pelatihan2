/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endaycb.pelatihan.dao;

import com.endaycb.pelatihan.model.Peserta;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author MASHIRO
 */
public interface PesertaDao extends PagingAndSortingRepository<Peserta, String>{
    
}
